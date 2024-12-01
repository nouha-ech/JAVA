package test;
public class Produit {
    private String nom;
    private double prix;
    private Categorie categorie;

    public Produit(String nom, double prix, Categorie categorie) {
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }

    public void afficherDetails() {
        System.out.println("Nom du produit: " + this.nom);
        System.out.println("Prix: " + this.prix);
        System.out.println("Catégorie: " + this.categorie.getNom());
    }

    public void changerCategorie(Categorie nouvelleCategorie) {
        this.categorie = nouvelleCategorie;
    }
}



