package com.principespoo.models;

public class CompteEpargne extends CompteBancaire{
	private double tauxInteret;
	
	public CompteEpargne(int numeroCompte, double solde, String proprietaire, double tauxInteret) {
		super(numeroCompte, solde, proprietaire);
		this.tauxInteret= tauxInteret;
	}
	
	public void calculerinteret() {
		double interet = getsolde() * tauxInteret / 100;
		deposer(interet);
		System.out.println("montant ajouté par interet est " + interet);
	}

}
