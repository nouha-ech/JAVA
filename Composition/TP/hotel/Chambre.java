package TP1;

public class Chambre {
	  private int numero;
	    private String type;

	    public Chambre(int numero, String type) {
	        this.numero = numero;
	        this.type = type;
	    }

	    public void afficherDetails() {
	        System.out.println("Chambre " + numero + ", type: " + type);

}
}