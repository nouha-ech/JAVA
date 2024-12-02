package TP1;

public class Etudiant extends Personne {
    private String niveau;

    public Etudiant(String nom, int age, String niveau) {
        super(nom, age);
        this.niveau = niveau;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("niveau: " + niveau);
    }
}
