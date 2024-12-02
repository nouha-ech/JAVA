package TP1;

public class Moteur {
	int puissance;
	String type;
	public int getPuissance() {
		return puissance;
	}
	public String getType() {
		return type;
	}
	
	public Moteur(int puissance, String type) {
		this.puissance = puissance;
		this.type = type;
	}
	
	public Moteur() {
		puissance = 0;
		type = "";
	}
	
	public String afficherDetails() {
		return "puissance" + getPuissance() + " type " + getType() + "" ;
	}

}
