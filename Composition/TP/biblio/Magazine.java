package TP1;

public class Magazine extends Livre{
	private String mois;
	private int Edition;
	public Magazine  (String titre,String auteur,int anneePublication,int Edition, String mois) {
		super(titre,auteur,anneePublication);
		this.Edition = Edition;
		this.mois = mois;
	}
	public String getmois() {
		return mois;
	}
	public int getEdition() {
		return Edition;
	}

	public String afficherDetails() {
		return super.afficherDetails() + " mois " + getmois() + "" + "edition: " + getEdition() ;
	}

}
