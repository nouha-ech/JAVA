package getvehicule;

public class Voiture extends Vehicule {
	int nombrePortes;
	
	public Voiture (String marque, int annee, int nombrePortes) {
		super(marque,annee);
		this.nombrePortes = nombrePortes;
	}
	
	public double calculerPrix() {
		return nombrePortes * 2500 + 5000;
	}
	public void afficherDetails() {
		super.afficherDetails(); 
		System.out.println(" le nombre des Portes: "+ nombrePortes);
	}


}
