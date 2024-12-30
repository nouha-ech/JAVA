package partie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestProduitMultiple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> produits = new ArrayList<>();
		
		List<Double> price = new ArrayList<>();
		
		try {
			for (int i = 0; i < 3; i++) {
			System.out.print("Entrez le nom du produit " + (i + 1) + " : ");
			String produit = scanner.nextLine();
			produits.add(produit);
			
			try {
				System.out.print("Entrez le prix du produit " + (i + 1) + " : ");
				double prix = Double.parseDouble(scanner.nextLine());
				
				if (prix < 0) {
					throw new IllegalArgumentException("Erreur : Le prix ne peut pas être négatif !");
				}
				price.add(prix);
			} catch (NumberFormatException e) {
			System.out.println("Erreur : Veuillez entrer un prix valide !");
			} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			}
			}
			System.out.println("Produits enregistrés : " + produits);
			System.out.println("Prix des produits : " + price);
			} catch (Exception e) {
			System.out.println("Une erreur inattendue s'est produite : " + e.getMessage());
			} finally {
			System.out.println("Fin de l'opération.");
			scanner.close();
			}
					

	}

}
