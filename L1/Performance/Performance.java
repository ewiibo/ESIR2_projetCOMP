import java.lang.runtime.*;

import javax.sound.midi.SysexMessage;

import java.lang.Process.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

public class Performance {
    File dossierOriginaux;
    File dossierResultat;

    Performance() {
        dossierOriginaux = new File(".");
        dossierResultat = new File(".");
    }

    Performance(String dossierOriginal, String dossierResultat) {
        this.dossierOriginaux = new File(dossierOriginal);
        this.dossierResultat = new File(dossierResultat);

        if (!this.dossierOriginaux.exists() || !this.dossierResultat.exists() ) {
            System.out.println("Un des dossiers spécifiés n'exsiste pas");
        }
    }

    public void run() {
        try{
        System.out.println("\n[Info]Lancement du script de performace du PrettyPrinter ..............");
        String[] listeOriginaux = dossierOriginaux.list();
        File fichierTemps = new File("temps.txt");
        File fichierTaille = new File("taille.txt");
        if(!fichierTemps.exists())fichierTemps.createNewFile();
        if(!fichierTaille.exists()) fichierTaille.createNewFile();


        FileWriter fWriter = new FileWriter(fichierTemps);
        FileWriter fWriterTaille = new FileWriter(fichierTaille);
        //BufferedWriter bWriter = new BufferedWriter(new FileWriter(fichierTemps.getName()));
        
        for (String nameFile : listeOriginaux) {
            
            File fileO = new File(dossierOriginaux.getPath() + "/" + nameFile);
            if (!fileO.isFile())
                continue;
            System.out.println("\nFichier "+fileO.getName());
            
            try{
                Runtime rt = Runtime.getRuntime();
                long debut = System.currentTimeMillis();
                Process pr = rt.exec("java -jar ../Tests/PrettyPrinter.jar "+ fileO.getAbsolutePath() +" -o resultats/"+ fileO.getName());
                
                //bWriter.write(Float.toString(fin-debut)+"\n");
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
                long fin = System.currentTimeMillis();
                System.out.println(fin-debut);
                fWriter.write(fin-debut+"\n");
                fWriterTaille.write(fileO.length()/1024 + "\n");
            }
            catch(InterruptedException e){
                System.err.println(e);
            
            }

        }
        fWriterTaille.close();
        fWriter.close();
        System.out.println("[Info] Comparaison terminée ..............\n");
    }
    catch(IOException e ){
        System.err.println(e);

    }
    }

    public static void main(String[] args) {
        Performance performance = new Performance("codes", "resultats");
        performance.run();

    }
    
}
