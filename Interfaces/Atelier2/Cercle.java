package interfaceTP;

public class Cercle extends Forme {
	double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	@Override
	public double calculerSurface(){
		return 3.14 * rayon * rayon ;
	};
	@Override
	public double calculerPerimetre(){
		return 3.14 * (rayon * 2);
	};

}
