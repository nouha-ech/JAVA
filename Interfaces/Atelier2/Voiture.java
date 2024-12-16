package interfaceTP;

public class Voiture extends Vehicule implements Reparable{
	
	int nombrePortes;
	
	public Voiture (String marque, String modele,int annee, int nombrePortes ) {
		super();
		this.nombrePortes = nombrePortes;
		
	}
	
	@Override
	void afficherDetails() {
		super.afficherDetails();
		System.out.println("nombre de porte "+ nombrePortes );
	}
	
	public void reparer() {
		System.out.println("la voiture est en reparation");
	}
	
	@Override
	void demarrer() {
		System.out.println("la voiture demarre" );
	}

}
