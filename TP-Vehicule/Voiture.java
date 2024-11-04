package vehicule;

public class Voiture {
	private String marque;
	private String modele;
	private int annee;
	private double prix;


	public Voiture (String marque,String modele,int annee, double prix) {
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.prix = prix;
	}
	public Voiture () {
		marque = "";
		modele = "";
		annee = 0;
		prix = 0;
	}
	
	public String  getmarque() {
		return marque;
	}
	public String  getmodele() {
		return modele;
	}
	
	public int getannee() {
		return annee;
	}
	public double getprix() {
		return prix;
	}
	public void setmarque(String marque) {
		this.marque = marque;
	}
	public void setmodele(String modele) {
		this.modele = modele;
	}
	
	public void setannee(int annee) {
		this.annee = annee;
	}
	public void setprix(double prix) {
		this.prix = prix;
	}
	  @Override
	    public String toString() {
	        return "Voiture de marque " + marque + " , de modele " +
	                modele + " annee " + annee +
	                ", le prix " + prix + "";
	        
	    }
	}
