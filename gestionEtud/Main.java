package gestionEtudiant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		        GestionEtudiants gestionEtudiants = new GestionEtudiants();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\n--- Menu ---");
		            System.out.println("1. Ajouter un étudiant");
		            System.out.println("2. Supprimer un étudiant");
		            System.out.println("3. Rechercher un étudiant");
		            System.out.println("4. Afficher tous les étudiants");
		            System.out.println("5. Afficher les étudiants admis");
		            System.out.println("6. Quitter");
		            System.out.print("Choisissez une option : ");
		            int choix = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (choix) {
		                case 1:
		                    System.out.print("Matricule : ");
		                    int matricule = scanner.nextInt();
		                    scanner.nextLine(); // Consommer la ligne
		                    System.out.print("Nom : ");
		                    String nom = scanner.nextLine();
		                    System.out.print("Prénom : ");
		                    String prenom = scanner.nextLine();
		                    System.out.print("Moyenne : ");
		                    double moyenne = scanner.nextDouble();
		                    scanner.nextLine(); // Consommer la ligne
		                    Etudiant etudiant = new Etudiant(matricule, nom, prenom, moyenne);
		                    gestionEtudiants.ajouterEtudiant(etudiant);
		                    break;

		                case 2:
		                    System.out.print("Matricule de l'étudiant à supprimer : ");
		                    int matriculeASupprimer = scanner.nextInt();
		                    gestionEtudiants.supprimerEtudiant(matriculeASupprimer);
		                    break;

		                case 3:
		                    System.out.print("Matricule de l'étudiant à rechercher : ");
		                    int matriculeRecherche = scanner.nextInt();
		                    gestionEtudiants.rechercherEtudiant(matriculeRecherche);
		                    break;

		                case 4:
		                    gestionEtudiants.afficherTousLesEtudiants();
		                    break;

		                case 5:
		                    gestionEtudiants.afficherEtudiantsAdmis();
		                    break;

		                case 6:
		                    System.out.println("Au revoir !");
		                    scanner.close();
		                    return;

		                default:
		                    System.out.println("Option invalide !");
		            }
		        }
		    }
		


	}


