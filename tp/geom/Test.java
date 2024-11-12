package Géométrique;

public class Test {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle("bleu",3, 2);
		
		Cercle c1 = new Cercle("jaune", 5);
		
		System.out.println(R1.calculerPerimetre());
		System.out.println(R1.calculerSurface());
		
		System.out.println(c1.calculerPerimetre());
		System.out.println(c1.calculerSurface());
		
		R1.afficherInfo();
		c1.afficherInfo();

	}

}
