
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class GenerateurLongueur {

    
    private static String pathFichiersBoutDeCode = "boutDeCode";
    private static String pathFichiersGeneres = "generes";
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Dans le prog");
        String entree , sortie;
        int nbreRepetition;
        switch (args.length) {
            case 2:
                entree = args[0];
                nbreRepetition =Integer.parseInt(args[1]) ;
                sortie = entree;
                break;
            case 3:
                entree = args[0];
                nbreRepetition =Integer.parseInt(args[1]) ;
                sortie = args[2];
                break;
            default:
                System.out.println("Erreur de Synthaxe : \n\t java -cp . generateur [Entree] [Nombre] [Sortie]");
                return ;
        }
        
        File fichierOriginal = new File(entree);
        if(fichierOriginal.exists()){
            System.out.println("Fichier trouvé");
            Scanner reader = new Scanner(fichierOriginal);
            String contenu = "";
            while(reader.hasNext()){
                contenu += reader.nextLine();
                contenu += "\n";
            }
            reader.close();
            
            File resultat = new File(sortie);
            if(resultat.exists())
                resultat.delete();
            try {
                if(resultat.createNewFile()){
                    FileWriter writer = new FileWriter(resultat.getName());
                    for(int i=0; i< nbreRepetition; i++)
                        writer.write(contenu+"\n");
                    writer.close();
                    System.out.println("Fin de l'ecriture");
                }
                    
            } catch (IOException ex) {
                Logger.getLogger(Generateur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
