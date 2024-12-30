package partie2;

import java.util.Scanner;


public class solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez le prix du produit : ");
            double price = scanner.nextDouble();

            if (price < 0) {
               throw new NegativePriceException("Erreur : Le prix ne peut pas être négatif !");
            }

            double tax = price * 0.2; // TVA 20%
            double totalPrice = price + tax;
            System.out.println("Prix avec TVA : " + totalPrice);
        } catch (NegativePriceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erreur : Entrée invalide !");
        } finally {
            System.out.println("Fin de l'opération.");
            scanner.close();
        }
    }
}