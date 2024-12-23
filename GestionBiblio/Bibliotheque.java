package GestionBiblio;

import java.util.ArrayList;

public class Bibliotheque {
	
	ArrayList <Livre> livres = new ArrayList<>();
	
	
	public void ajouterLivre(Livre livre) {
		livres.add(livre);
		System.out.println("le livre a été ajouté ave succes");
	}
	
	public void supprimerLivre(String titre) {
		
		for (Livre livre : livres) {
			if (livre.getTitre().equalsIgnoreCase(titre)) {
			livres.remove(livre);
			System.out.println("Livre supprimé avec succès !");
			return;
			}
		}
		System.out.println("Livre introuvable !");
	}
	
	public void rechercherLivre(String titre) {
		for (Livre livre : livres) {
			if (livre.getTitre().equalsIgnoreCase(titre)) {
			livre.afficherDetails();
			return;
			}
			}
			System.out.println("Livre introuvable !");
	}
	
	public void afficherTousLesLivres(){
		if (livres.isEmpty()) {
			System.out.println("Aucun livre dans la bibliothèque.");
			} else {
			for (Livre livre : livres) {
			livre.afficherDetails(); System.out.println("-------------------");
			}
			}
	}
	
	public void afficherLivresDisponibles() {
		
		boolean disponibleTrouve = false;
		for (Livre livre : livres) {
		if (livre.isDisponible()) {
		livre.afficherDetails();
		System.out.println("-------------------");
		disponibleTrouve = true;
		}
		}
		if (!disponibleTrouve) { System.out.println("Aucun livre disponible."); 
		}
	}

}
