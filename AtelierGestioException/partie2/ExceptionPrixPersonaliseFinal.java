package partie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPrixPersonaliseFinal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("entrer nom de produit");
			String produit = sc.nextLine();
			
			System.out.println("entrer prix de produit");
			double prix = sc.nextDouble();
			
			if (prix >1000) {
				throw new PrixInvalidException("erreur: le prix depasse limite autorise");
				
			}
			System.out.println("Produit enregistré : " + produit + ", Prix : " + prix);
			
		} catch (PrixInvalidException e) {
			System.out.println(e.getMessage());
			
		} catch (InputMismatchException e) {
			System.out.println("Erreur : Veuillez entrer un prix valide !");
			} finally {
			System.out.println("Fin de l'opération.");
			sc.close();
		}
		
// lequel s'execute??
	}

}
