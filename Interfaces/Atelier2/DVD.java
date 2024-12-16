package interfaceTP;

public class DVD extends Media implements Empruntable{
	double duree;
	
	
	@Override 
	public void AfficherDetails() {
		super.AfficherDetails();
		System.out.println("la duree est " + duree );
	}
	
	@Override
	public void emprunter() {
		System.out.println("le DVD est emprunté");
	}

}
