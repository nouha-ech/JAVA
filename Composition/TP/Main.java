package TP1;


public class Main {

	public static void main(String[] args) {
		
		// ex biblio
		Livre l = new Livre("in dec ", "anna", 1976);
		Roman r = new Roman("in dec ", "anna", 1976, "comedie");
		Magazine m = new Magazine("in dec ", "anna", 1976, 3, "juillet" );
		
	
		
		System.out.println(l.afficherDetails());
		System.out.println(r.afficherDetails());
		System.out.println(m.afficherDetails());
		
		// ex mode paiment
		
		
		MoyenPaiement x = new MoyenPaiement(1976);
		MoyenPaiement p = new PayPal(3000);
		MoyenPaiement c = new CarteBancaire(70000);
		
		
		
		System.out.println(x.payer(500));
		System.out.println(p.payer(500));
		System.out.println(c.payer(500));
		
		// ex moteur
		
		Moteur mot = new Moteur(5000,"max");
		Voiture v1 = new Voiture("Toyota", "gg",mot);
		System.out.println(v1.afficherDetails());
		
		
		// ex hotel
		Chambre cha = new Chambre(101, "Double");
        Reservation reserv = new Reservation("nouha", cha);
        Facture f1 = new Facture(reserv);

        f1.afficherDetails();
		
		
		// ex ecole
        
        Ecole ghazala = new Ecole();

        ghazala.ajouterPersonne(new Professeur("Mme houda", 50, "tec"));
        ghazala.ajouterPersonne(new Etudiant("nohaila", 20, "infor"));

        ghazala.afficherTous();
	
	// ex zoo
	
	   Zoo ainsebaa = new Zoo();

	   ainsebaa.ajouterAnimal(new Lion());
	   ainsebaa.ajouterAnimal(new Elephant());
	   ainsebaa.ajouterAnimal(new Oiseau());

	   ainsebaa.faireParlerTous();
	}
	
   
}

	

