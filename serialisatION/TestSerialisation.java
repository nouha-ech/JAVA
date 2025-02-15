package lesfichiersTP.ex1;

import java.io.*;

public class TestSerialisation {
    public static void main(String[] args) {
        String nomFichier = "personne.ser";

        
        Personne personne1 = new Personne("nohaila", 20);

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier))) {
            oos.writeObject(personne1);
            System.out.println("Objet sérialisé et enregistré dans " + nomFichier);
        } catch (IOException e) {
            System.out.println("Erreur lors de la sérialisation.");
            e.printStackTrace();
        }

       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFichier))) {
            Personne personneRecuperee = (Personne) ois.readObject();
            System.out.println("Objet désérialisé :");
            personneRecuperee.afficher();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erreur lors de la désérialisation.");
            e.printStackTrace();
        }
    }
}
