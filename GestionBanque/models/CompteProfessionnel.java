package com.principespoo.models;

public class CompteProfessionnel extends CompteBancaire{
	private double decouvertAutorise;
	
	public CompteProfessionnel(int numeroCompte, double solde, String proprietaire, double decouvertAutorise) {
		super(numeroCompte, solde, proprietaire);
		this.decouvertAutorise= decouvertAutorise;
	}
	
	@Override
	public void retirer(double montant) {
		if (montant>0 && getsolde() - montant >= -decouvertAutorise) {
			super.retirer(montant);
		}
		else {
			System.out.println("impossible de retirer: limite de decouvert");
		}
	}

}
