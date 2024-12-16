package interfaceTP;

public class Livre extends Media implements Empruntable{
	
	int nombrePages;
	
	@Override 
	public void AfficherDetails() {
		super.AfficherDetails();
		System.out.println("le nombre de page est " + nombrePages );
	}
	
	
	@Override
	public void emprunter() {
		System.out.println("le livre est emprunté");
	}

}
