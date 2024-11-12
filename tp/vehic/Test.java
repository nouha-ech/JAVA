package getvehicule;

public class Test {

	public static void main(String[] args) {
		Moto m1 = new Moto("xx", 2000, 3);
		Voiture v1 = new Voiture("bmw", 2001, 4);
		
		v1.afficherDetails();
		m1.afficherDetails();
		v1.calculerPrix();
		m1.calculerPrix();

	}

}
