package Géométrique;

public class Rectangle extends Forme{
	double longueur;
	double largeur;

	public Rectangle(String couleur, double longueur,double largeur) {
		super(couleur);
		this.longueur=longueur ;
		this.largeur= largeur;
		
	}
	
	public double calculerSurface(){
		return longueur * longueur ;
	};
	public double calculerPerimetre(){
		return (longueur+ longueur) * 2;
	};
	
	public void afficherInfo() {
		super.afficherInfo();
		System.out.println(" la longueur: "+ longueur + " et la largueur est: " + largeur);
	}

}
