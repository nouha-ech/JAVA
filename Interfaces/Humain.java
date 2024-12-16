package abstractcltp;


public class Humain extends EtreVivant implements EtreVivants {

	public Humain(String nom, int age, String genre) {
		super(nom, age, genre);
		
	}
	 public void manger() {
		 System.out.println("L'animal mange");
	 }}
