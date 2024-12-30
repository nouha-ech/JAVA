package partie3;

public class Main {
	public static void main(String[] args) {

	   try {
	         CompteBancaire compte = new CompteBancaire("Alice", 1000.0);

	         compte.deposer(500.0);

	     
	         compte.retirer(200.0);

	    
	         compte.retirer(2000.0); 
	     } catch (IllegalArgumentException e) {
	         System.out.println("Erreur de dépôt : " + e.getMessage());
	     } catch (InsufficientFundsException e) {
	         System.out.println("Erreur de retrait : " + e.getMessage());
	     }
	 }
}

