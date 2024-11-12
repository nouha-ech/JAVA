package Géométrique;

public class Cercle extends Forme {
	double rayon;

	public Cercle(String couleur, double rayon) {
		super(couleur);
		this.rayon = rayon;
	}
	
	public double calculerSurface(){
		return 3.14 * rayon * rayon ;
	};
	public double calculerPerimetre(){
		return 3.14 * (rayon * 2);
	};
	
	public void afficherInfo() {
		super.afficherInfo();
		System.out.println(" le rayon: "+ rayon );
	}


}
