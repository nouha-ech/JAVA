package TP1;

public class MoyenPaiement {
	private double montant;
	
	public MoyenPaiement(double montant) {
		this.montant = montant;
		
	}

	public String payer(double montant) {
		return "Paiement de " + montant + "€ via un moyen inconnu.";
	}


}
