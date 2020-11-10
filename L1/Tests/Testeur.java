import java.lang.runtime.*;

import javax.sound.midi.SysexMessage;

import java.lang.Process.*;
import java.io.File;
import java.io.IOException;
import java.lang.Thread.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Testeur {
    File dossierOriginaux;
    File dossierResultat;
    File dossierAttendu;

    Testeur() {
        dossierAttendu = new File(".");
        dossierOriginaux = new File(".");
        dossierResultat = new File(".");
    }

    Testeur(String dossierOriginal, String dossierResultat, String dossierAttendu) {
        this.dossierOriginaux = new File(dossierOriginal);
        this.dossierResultat = new File(dossierResultat);
        this.dossierAttendu = new File(dossierAttendu);

        if (!this.dossierOriginaux.exists() || !this.dossierResultat.exists() || !this.dossierAttendu.exists()) {
            System.out.println("Un des dossiers spécifiés n'exsiste pas");
        }
    }

    public void run() {
        System.out.println("[Info]Lancement du script de test de code While ..............\n");
        String[] listeOriginaux = dossierOriginaux.list();
        for (String nameFile : listeOriginaux) {
            
            File fileO = new File(dossierOriginaux.getPath() + "/" + nameFile);
            if (!fileO.isFile())
                continue;
            System.out.println("Fichier "+fileO.getName());
            try{
                Runtime rt = Runtime.getRuntime();
                Process pr = rt.exec("java -jar PrettyPrinter.jar "+ fileO.getAbsolutePath() +" -o resultats/"+ fileO.getName());
                new Thread(() -> {
                    BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                    String line = null;

                    try {
                        while ((line = input.readLine()) != null)
                            System.out.println(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
                
                pr.waitFor();
            }
            catch(InterruptedException e){
                System.err.println(e);
            }
            catch(IOException e ){
                System.err.println(e);

            }
            

        }
        System.out.println("[Info] Comparaison terminée ..............\n");
    }

    public static void main(String[] args) {
        Testeur testeur = new Testeur("originaux", "resultats", "attendus");
        testeur.run();

    }
    
}
