package TP1;

public class Professeur extends Personne{
	 private String matiere;

	    public Professeur(String nom, int age, String matiere) {
	        super(nom, age);
	        this.matiere = matiere;
	    }

	    @Override
	    public void afficherDetails() {
	        super.afficherDetails();
	        System.out.println("Matière: " + matiere);
	    }
	}
