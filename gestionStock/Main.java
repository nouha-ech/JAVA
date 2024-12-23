package gestionStock;

import java.util.Scanner;

import GestionBiblio.Livre;

public class Main {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Ajouter un produit");
			System.out.println("2. Supprimer un produit");
			System.out.println("3. Rechercher un produit");
			System.out.println("4. Afficher tous les produits");
			System.out.println("5. Quitter");
			System.out.print("Choisissez une option : ");
			int choix = sc.nextInt();
			sc.nextLine(); 
			switch (choix) {
			case 1:
				System.out.print("l'id de produit : ");
				int id = sc.nextInt();
				System.out.print("nom : ");
				String nom = sc.nextLine();
				System.out.print("prix : ");
				double prix = sc.nextDouble();
				System.out.print("Quantité : ");
				int quantite = sc.nextInt();
				stock.ajouterProduit(new Produit(id, nom, prix, quantite));
				break;
			case 2:
				System.out.print("entrez l'id du produit à supprimer : ");
				int idprod = sc.nextInt();
				stock.supprimerProduit(idprod);
				break;
			case 3:
				System.out.print("l'id du produit à rechercher : ");
				int idprodrecherche = sc.nextInt();  // faut pas les renommer meme nom
				stock.rechercherProduit(idprodrecherche);
				break;
			case 4:
				stock.afficherProduits();
				break;
			case 5:
				System.out.println("Au revoir !");
				sc.close();
				return;
				default:
				System.out.println("option invalide !");
				
			}
		}
		

	}

}
