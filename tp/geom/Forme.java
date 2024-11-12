package Géométrique;

public class Forme {
	protected String couleur;

	public Forme(String couleur) {
		this.couleur = couleur;
	}




	public void afficherInfo() {
		System.out.println(" la couleur: "+ couleur );
	}
	
	public double calculerSurface(){
		return 0 ;
	};
	public double calculerPerimetre(){
		return 0;
	};


}
