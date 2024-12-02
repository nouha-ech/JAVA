package TP1;

public class Voiture {
	String marque;
	String modele;
	Moteur moteur;
	
	public String getMarque() {
		return marque;
	}


	public String getModele() {
		return modele;
	}

	public Moteur getMoteur() {
		return moteur;
	}
	
	public Voiture(String marque, String modele, Moteur moteur) {
		this.marque = marque;
		this.modele = modele;
		this.moteur = moteur;
	}
	
	public String afficherDetails() {
		return "marque" + getMarque() + " modele " + getModele() + moteur.afficherDetails() ;
	}

}
