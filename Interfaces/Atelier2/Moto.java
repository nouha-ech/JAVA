package interfaceTP;

public class Moto extends Vehicule implements Reparable{
	String typeGuidon;
	
	public Moto (String marque, String modele,int annee, String typeGuidon) {
		super();
		this.typeGuidon = typeGuidon;
	}
	
       public void reparer() {
		System.out.println("le moto est en reparation");
	}


}
