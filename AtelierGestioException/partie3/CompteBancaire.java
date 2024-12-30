package partie3;

public class CompteBancaire {
	 private double solde;
	 private String titulaire;

	
	 public CompteBancaire(String titulaire, double soldeInitial) {
	     this.titulaire = titulaire;
	     this.solde = soldeInitial;
	 }
	 public void deposer(double montant) {
	     if (montant < 0) {
	         throw new IllegalArgumentException("montant depot invalide");
	     }
	     solde += montant;
	     System.out.println("depot effecté avec succès votre nouveau solde est : " + solde);
	 }

	 
	 public void retirer(double montant) throws InsufficientFundsException {
	     if (montant > solde) {
	         throw new InsufficientFundsException("Solde insuffisant");
	     }
	     solde -= montant;
	     System.out.println("retrait effecté avec succès votre nouveau solde  : " + solde);
	 }

	
	 public double getSolde() {
	     return solde;
	 }

	 
	 public String getTitulaire() {
	     return titulaire;
	 }
}
