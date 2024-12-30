package gestionException.tp1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestString {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		 System.out.println("Entrez une chaîne pour la convertir en nombre ");
		 String input = sc.next();
		 
		 
		 try {
			 int number = Integer.parseInt(input);
			 System.out.println("Nombre converti : " + number);
			 } catch (NumberFormatException e) {
			 System.out.println("Erreur : La chaîne n'est pas un nombre valide !");
			 }
		
		
		
		System.out.println("entrez un entier: ");
		double nb1= sc.nextInt();
		System.out.println("entrez un entier: ");
		double nb2= sc.nextInt();
		double res = nb1 / nb2;
		
		System.out.println("le resultat de votre division est : " + res);
		
		} catch (ArithmeticException e) {
			System.out.println("division par zéro est impossible ");
			} catch (InputMismatchException e) {
			System.out.println( "vous devez entrer un nombre valide ");
			} finally {
			System.out.println("Fin de l'opération.");
			sc.close();
		
		
			}
		}
}