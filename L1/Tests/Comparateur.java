
import java.io.File;
import java.io.FileNotFoundException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saoussane_Anfane
 */
public class Comparateur {
    File dossierOriginaux;
    File dossierResultat;
    File dossierAttendu;

    Comparateur() {
        dossierAttendu = new File(".");
        dossierOriginaux = new File(".");
        dossierResultat = new File(".");
    }

    Comparateur(String dossierOriginal, String dossierResultat, String dossierAttendu) {
        this.dossierOriginaux = new File(dossierOriginal);
        this.dossierResultat = new File(dossierResultat);
        this.dossierAttendu = new File(dossierAttendu);

        if (!this.dossierOriginaux.exists() || !this.dossierResultat.exists() || !this.dossierAttendu.exists()) {
            System.out.println("Un des dossiers spécifiés n'exsiste pas");
        }
    }

    public void run() {
        System.out.println("[Info]Lancement du comparateur de code While ..............\n");
        String[] listeOriginaux = dossierOriginaux.list();
        int compteur = 5;
        boolean etat;
        for (String nameFile : listeOriginaux) {
            compteur = 0;
            etat = true;
            File fileO = new File(dossierOriginaux.getPath() + "/" + nameFile);
            if (!fileO.isFile())
                continue;
            File fileR = new File(dossierResultat.getName() + "/" + nameFile);
            if (!fileR.exists()) {
                System.err.println("Le fichier resultat " + fileR.getName() + " n'exsite pas");
                continue;
            }
            File fileA = new File(dossierAttendu.getName() + "/" + nameFile);
            if (!fileA.exists()) {
                System.err.println("Le fichier attendu " + fileA.getName() + " n'exsite pas");
                continue;
            }
            
            try {
                Scanner scanR = new Scanner(fileR);
                Scanner scanA = new Scanner(fileA);
                while (scanA.hasNext() || scanR.hasNext()) {
                    compteur++;
                    String lineR = scanR.nextLine();
                    String lineA = scanA.nextLine();
                    if (!lineR.equals(lineA)) {
                        System.err.println("\nFichier " + fileR.getName());
                        System.err.println("Diffence à la ligne " + compteur + " :");
                        System.err.println(" R ===>" + lineR);
                        System.err.println(" A ===>" + lineA + "\n");
                        etat = false;
                        break;
                    }
                }
                if (etat)
                    System.out.println("\n[OK] " + fileR.getName() + "\n");

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Comparateur.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
        System.out.println("[Info] Comparaison terminée ..............\n");
    }

    public static void main(String[] args) {
        Comparateur comp = new Comparateur("originaux", "resultats", "attendus");
        comp.run();

    }

}
