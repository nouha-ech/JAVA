package test;
import metier.Compte;

public class Application {

	public static void main(String[] args) {
		Compte co1 = new Compte (5000);
		Compte co2 = new Compte (1000);
		System.out.println(co1.toString());
		System.out.println(co2.toString());
		System.out.println("le nombre des comptes est : "+ Compte.getNbComptes());
	
	}

}
