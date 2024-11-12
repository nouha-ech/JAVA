package getvehicule;

public class Vehicule {
	protected String marque;
	protected int annee;
	public Vehicule(String marque, int annee) {
		this.marque = marque;
		this.annee = annee;
	}
	
	public double calculerPrix() {
		return 0;
	}
	
	public void afficherDetails() {
		System.out.println(" la marque: "+ marque + " et l'année de production est: " + annee);
	}
	


}
