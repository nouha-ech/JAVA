package getvehicule;

public class Moto extends Vehicule {
	int cylindree;
	
	public Moto (String marque, int annee, int cylindree) {
		super(marque,annee);
		this.cylindree = cylindree ;
	}
	
	public double calculerPrix() {
		return cylindree * 1500 + 7000;
	}
	
	public void afficherDetails() {
		super.afficherDetails(); 
		System.out.println("  la cylindrée de la moto: "+ cylindree);
	}

}
