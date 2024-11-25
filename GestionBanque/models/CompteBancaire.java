package com.principespoo.models;

public class CompteBancaire {
	private int numeroCompte;
	private double solde;
	private String proprietaire;
	
	public CompteBancaire(int numeroCompte,double solde,String proprietaire){
		this.numeroCompte= numeroCompte;
		this.solde= solde;
		this.proprietaire= proprietaire;
		
		
	}
	public int getnumeroCompte() {
		return numeroCompte;
	}
	
	public double getsolde() {
		return solde;
	}
	
	public String getproprietaire() {
		return proprietaire;
	}
	
	public void setnumeroCompte(int numeroCompte) {
		this.numeroCompte= numeroCompte;
	}
	
	public void setsolde(double solde) {
		this.solde= solde;
	}
	
	public void setproprietaire(String proprietaire) {
		this.proprietaire= proprietaire;
	}
	
	
	public void deposer(double montant) {
		if (montant>0) {
			solde+= montant;
		}
		else {
			System.out.println("entrez un montant correct!");
		}
	}
	
	public void retirer(double montant) {
		if (montant>0 && montant<=solde) {
			solde-= montant;
		}
		else {
			System.out.println("erreur de retrait");
		}
	}	
}
	
