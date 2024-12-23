package gestionStock;

public class Produit {
	private int id;
	private String nom;
	private double prix;
	private int quantite;
	
	public Produit(int id, String nom, double prix, int quantite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}
	

	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public int getQuantite() {
		return quantite;
	}



	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}



	public void afficherDetails() {
		System.out.println( "Produit id " + id);
		System.out.println( "nom de produit " + nom); 
		System.out.println(" prix de produit " + prix);
		System.out.println(" quantite de produit dans stock " + quantite);
	}


	
	public void modifierQuantite(int nouvelleQuantite) {		
		setQuantite(nouvelleQuantite);	
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
}
