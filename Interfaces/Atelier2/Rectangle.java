package interfaceTP;

public class Rectangle extends Forme {
	double longueur;
	double largeur;
	
	@Override
	public double calculerSurface(){
		return longueur * longueur ;
	};
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	@Override
	public double calculerPerimetre(){
		return (longueur+ longueur) * 2;
	};
	

}
