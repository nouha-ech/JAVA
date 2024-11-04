package Etu;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Etudiant n = new Etudiant("nouha",15);
		GestionEtudiants DSI = new GestionEtudiants(30);
		DSI.AjouterEtudiant("nouha",15);
		DSI.AjouterEtudiant("Zainab", 16);
		DSI.AjouterEtudiant("bassma", 16);
		RechercherEtudiant("reda");
		
		
		System.out.println("Avant le tri:");
        DSI.AfficherEtudiants();
        DSI.TrierEtudiants();
        
        System.out.println("Après le tri:");
        DSI.AfficherEtudiants();
	}

	private static void RechercherEtudiant(String string) {
		
	}
}
