package gestionEtudiant;

import java.util.ArrayList;

import GestionBiblio.Livre;
import gestionStock.Produit;

public class GestionEtudiants {
	ArrayList <Etudiant> etudiants = new ArrayList<>();
	
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
		System.out.println("etudiant ajouté avec succès");
		
	}
	
	public void supprimerEtudiant(int matricule) {
		for (Etudiant etudiant : etudiants ) {
			if (etudiant.getMatricule()==matricule){  
				etudiants.remove(etudiant);
				System.out.println("etudiant supprimé avec succès !");
				return;
				}
			}
			System.out.println("l'etudiant avec ce matricule n'existe pas");
		}
	
	public void afficherTousLesEtudiants() {
		if (etudiants.isEmpty()) {
			System.out.println("la liste des etudiants est vide");
		}
		else {
			System.out.println("_________________________________");
			System.out.println("les etudiants sont:");
			System.out.println("_________________________________");
			for (Etudiant etudiant : etudiants) {
				etudiant.afficherDetails();
				System.out.println("_________________________________");
			}		
		}		
	}
	
	
	public void rechercherEtudiant(int matricule) {
		for (Etudiant etudiant : etudiants) {
			if (etudiant.getMatricule()==matricule) {
				etudiant.afficherDetails();
			}
			else {
				System.out.println("etudiant avec ce matricule n'existe pas");
			}
		}
	}
	
	
	public void afficherEtudiantsAdmis() {
		
		for (Etudiant etudiant : etudiants) {
		if (etudiant.getMoyenne()>10) {
		etudiant.afficherDetails();
		System.out.println("-------------------");
		
		}
		}
	}
	}
	
			
	
