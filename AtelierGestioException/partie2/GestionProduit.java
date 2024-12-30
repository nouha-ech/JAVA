package partie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionProduit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Produit;
		double Prix;
		double TotalPrix=0;
		int ProductCount=0;
	
		
		try {
			System.out.println("entrer nom de produit");
			Produit = sc.next();
			System.out.println("entrer le prix de produit");
			Prix = sc.nextDouble();
			
			if (Prix<0) {
				// illegal arg??
				throw new IllegalArgumentException("Erreur : Le prix ne peut pas être négatif !");
			}
			
			TotalPrix =+Prix;
			ProductCount++;
			
			// moyenne
			
			double PrixMoy = TotalPrix / ProductCount;
			System.out.println("Prix moyen des produits : " + PrixMoy);
			
		} catch (InputMismatchException e) {
			System.out.println("Erreur : vous devez entrer un prix valide");
			//ill arg getmesg method
			} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			} finally {
			System.out.println("Fin de l'opération.");
			sc.close();
			
		
		}
	}

}
