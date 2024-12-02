package TP1;

public class CarteBancaire extends MoyenPaiement {
	
	public CarteBancaire (double montant) {
	super(montant);
	}
	
	@Override
	public String payer(double montant) {
		return "Paiement de " + montant + "€ via CarteBancaire.";
	}
	
	

}
