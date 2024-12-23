package gestionStock;

import java.util.ArrayList;

public class Stock {
	ArrayList <Produit> Produits = new ArrayList<>();
	
	
	public void ajouterProduit(Produit produit) {
		Produits.add(produit);
		System.out.println("produit ajouté avec succès");
		
	}
	
	public void supprimerProduit(int id) {
		for (Produit produit : Produits ) {
			if (produit.getId()==id){  
				Produits.remove(produit);
				System.out.println("produit supprimé avec succès !");
				return;
				}
			}
			System.out.println("ce produit n'existe pas");
		}
				
			public void afficherProduits() {
				if (Produits.isEmpty()) {
					System.out.println("le stock is vide");
					
				}
				else {
					System.out.println("_________________________________");
					System.out.println("les produits existants dans le stocks sont:");
					System.out.println("_________________________________");
					for (Produit prod : Produits) {
						prod.afficherDetails();
						System.out.println("_________________________________");
					}		
				}		
			}
			
			
			public void rechercherProduit(int id) {
				for (Produit prod : Produits) {
					if (prod.getId()==id) {
						prod.afficherDetails();
					}
					else {
						System.out.println("ce produit n'existe pas");
					}
				}
			}
		
		
	
}
