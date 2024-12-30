package gestionException.tp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPersonalis {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.print("Entrez un nombre positif : ");
		int num = scanner.nextInt();
		
		if (num<0) {
			throw new NegNumException ("Erreur : Le nombre est négatif !");
			}
		System.out.println("Nombre valide : " + num);
		} catch (NegNumException e) {
		System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
		System.out.println("Erreur : Veuillez entrer un nombre valide !");
		} finally {
		System.out.println("Fin du programme.");
		scanner.close();
		}
		//diff entre ex in try and catch

	}

}
