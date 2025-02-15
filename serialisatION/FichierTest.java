package lesfichiersTP.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FichierTest {
    public static void main(String[] args) {
        String nomFichier = "test.txt";
        try {
            File fichier = new File(nomFichier);
            if (fichier.createNewFile()) {
                System.out.println("Fichier créé : " + fichier.getName());
            } else {
                System.out.println("Le fichier existe déjà.");
            }

           
            FileWriter writer = new FileWriter(nomFichier);
            writer.write("Bonjour, ceci est un fichier de test en Java !");
            writer.close();
            System.out.println("Texte écrit dans le fichier.");
        } catch (IOException e) {
            System.out.println("Une erreur est survenue.");
            e.printStackTrace();
        }

      
        try {
            FileReader reader = new FileReader(nomFichier);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String ligne;
            System.out.println("Contenu du fichier :");
            while ((ligne = bufferedReader.readLine()) != null) {
                System.out.println(ligne);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erreur de lecture du fichier.");
            e.printStackTrace();
        }

       
        File fichierASupprimer = new File(nomFichier);
        if (fichierASupprimer.delete()) {
            System.out.println("Le fichier a été supprimé.");
        } else {
            System.out.println("Impossible de supprimer le fichier.");
        }
    }
}

