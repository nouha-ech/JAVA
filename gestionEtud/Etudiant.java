package gestionEtudiant;

public class Etudiant {
	private int matricule;
	private String nom;
	private String prenom;
	private double moyenne;
	
	
	public Etudiant(int matricule, String nom, String prenom, double moyenne) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.moyenne = moyenne;
	}
	
	public void afficherDetails() {
		System.out.println( "matricule " + matricule);
		System.out.println( "nom de l'etudiant " + nom); 
		System.out.println("prenom de l'etudiant " + prenom);
		System.out.println(" moyenne l'etudiant" + moyenne);
	}
	
	
	public int getMatricule() {
		return matricule;
	}



	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public double getMoyenne() {
		return moyenne;
	}


	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	public void modifierMoyenne(double nouvelleMoyenne) {
		setMoyenne(nouvelleMoyenne);
	}

}
