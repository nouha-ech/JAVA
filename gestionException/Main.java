package gestException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) 
		{ System.out.print("entrez un nombre : "); 
		int number = scanner.nextInt(); 
		System.out.println(number); } 
		catch (InputMismatchException e) {
           System.out.println("entrer un nombre valide!");
           } 
		catch (ArithmeticException e) {
			System.out.println("impossible d'utiliser zero !");
			} catch (Exception e) { // err general
				System.out.println("Quelque chose s'est mal passé");
				} finally {
           System.out.println("bloc touj executé"); 
           }
		}
}