package test;

public class Main {
    public static void main(String[] args) {

        Categorie categorie = new Categorie("Electronique");
        Produit produit = new Produit("Smartphone", 699.99, categorie);
       
        produit.afficherDetails();
     
        Categorie nouvelleCategorie = new Categorie("Informatique");
        produit.changerCategorie(nouvelleCategorie);
    }
}
              