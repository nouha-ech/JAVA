package atm;

import java.util.Scanner;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static Compte cpt;

    public static void main(String[] args) {
        System.out.println("Bienvenue");
        System.out.println("Vous devez créer un compte");

        System.out.print("Entrez votre nom: ");
        String user = scanner.nextLine();
        System.out.print("Entrez un mot de passe: ");
        String mdp = scanner.nextLine();
        System.out.print("Entrez le solde initial: ");
        Double soldeInitial = scanner.nextDouble();

        // Creation d'une instance
        cpt = new Compte(user, mdp, soldeInitial);
        while (true) {
            System.out.println("Menu");
            System.out.println("1 - Dépôt");
            System.out.println("2 - Retrait");
            System.out.println("3 - Voir mon solde");
            System.out.println("4 - Voir historique des transactions");
            System.out.println("5 - Calculer intérêt");
            System.out.println("6 - Quitter");
            System.out.print("Choisir option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    depot();
                    break;

                case 2:
                    retrait();
                    break;

                case 3:
                    System.out.println("Votre solde est : " + cpt.getSolde() + " dirham");
                    break;

                case 4:
                    cpt.voirHistorique();
                    break;

                case 5:
                    calculInteret();
                    break;

                case 6:
                    System.out.println("Au revoir");
                    return;

                default:
                    System.out.println("Option invalide");
            }
        }
    }

    private static void depot() {
        System.out.print("Entrez le montant que vous voulez déposer: ");
        double montant = scanner.nextDouble();
        cpt.depot(montant);
    }

    private static void retrait() {
        System.out.print("Entrez le montant que vous voulez retirer: ");
        double montant = scanner.nextDouble();
        if (cpt.retrait(montant)) {
            System.out.println("Vous avez effectué un retrait de " + montant + " dirham");
        }
    }

    private static void calculInteret() {
        System.out.print("Entrez le taux d'intérêt: ");
        double tauxInteret = scanner.nextDouble();
        cpt.calculInteret(tauxInteret);
    }
}
