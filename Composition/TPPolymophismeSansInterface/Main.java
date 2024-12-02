package com.polymorphisme;

public class Main {

	public static void main(String[] args) {
		MathUtil util = new MathUtil();
		System.out.println("addition d'entiers: " + util.calculer(3, 5));
		System.out.println("addition des doubles: " + util.calculer(2.5, 3.5));
		System.out.println("multiplication d'entiers: " + util.calculer(3, 5,true));
		
		
		
		// Exercice 2
		
		Animal[] animaux = {new Chien() , new Chat() };
		for (Animal animal: animaux) {
			animal.parler();
		}
		
		
		// Exercice 3
		
		Employe[] employes = {new EmployePleinTemps("alice", 3000,500), new EmployeTempsPartiel("bob",20,15)};
		
		for (Employe employe : employes) {
			System.out.println(employe.nom + " gagne : " + employe.calculerSalaire() + "$.");
	
		}
	}
	
	
 
            

}
	
	
