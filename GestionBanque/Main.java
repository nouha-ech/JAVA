package com.principespoo;

//Exercise 3 (packages)
import com.principespoo.models.CompteBancaire;
import com.principespoo.models.CompteEpargne;
import com.principespoo.models.CompteProfessionnel;

public class Main {
	
	// Exercise 1

	public static void main(String[] args) {
		CompteBancaire cpt = new CompteBancaire(1,5000,"nouha");
		System.out.println(cpt.getnumeroCompte());
		System.out.println(cpt.getproprietaire());
		System.out.println(cpt.getsolde());
		
		cpt.deposer(100000);
		
		System.out.println(cpt.getsolde());
		
		cpt.retirer(7000);
		
		System.out.println(cpt.getsolde());
		
		cpt.retirer(100000000);
		// throw 
		System.out.println(cpt.getsolde());
		
		// Exercise 2
		
		CompteEpargne cep = new CompteEpargne(1,1000,"siham", 15);
		System.out.println("solde avant calcul d'interet " + cep.getsolde());
		cep.calculerinteret();
		System.out.println("solde apres calcul d'interet " + cep.getsolde());

		
		// Exercise 4
		CompteProfessionnel cptpro = new CompteProfessionnel(5,500,"hajar", 5000);
		System.out.println("solde avant retrait  \n" + cptpro.getsolde());
		cptpro.retirer(100);
		System.out.println("apres premier retrait  \n" + cptpro.getsolde());
		cptpro.retirer(1500);
		System.out.println("solde apres retrait montant > solde mais < a la limiite  \n" + cptpro.getsolde());
		cptpro.retirer(6000);
		System.out.println("apres essayer de retirer montant plus que decouvert  \n" + cptpro.getsolde());
	}

}
