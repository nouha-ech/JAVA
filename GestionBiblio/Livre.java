package GestionBiblio;

public class Livre { // add private !!!!
	private String titre;
	private String auteur;
	private int anneePublication;
	private boolean disponible;
	
	
	public Livre(String titre, String auteur, int anneePublication, boolean disponible) {
		
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
		this.disponible = disponible;
	}


	
	public void afficherDetails() {
		System.out.println( "Livre de titre " + titre + ", auteur " + auteur + ", anneePublication " + anneePublication
				+ ", disponiblé: " + disponible);
	}


	public void changerDisponibilite(boolean disponible) {
		disponible = !disponible;  // contraire
	}
	
	public String getTitre() { 
		return titre; 
		}
	public boolean isDisponible() { 
		return disponible; 
		}

}
