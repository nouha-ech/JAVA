package Etu;

public class Etudiant {
	String nom;
	int note;
	
	public Etudiant(String nom, int note) {
		this.nom = nom;
		this.note = note;
	}

	
	// pour l'utiliser dans recherche
	public String getNom() {
        return nom;
    }
	public void AfficherDetails() {
		System.out.println("nom étudiant: "+ nom + " \t \t \t note: " + note);
		
	}

}
