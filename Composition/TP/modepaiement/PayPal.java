package TP1;

public class PayPal extends MoyenPaiement {
	
	public PayPal (double montant) {
		super(montant);
		}
	
	@Override
	public String payer(double montant) {
		return "Paiement de " + montant + "€ via Paypal.";
	}
	

}
