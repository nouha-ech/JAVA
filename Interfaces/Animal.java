package abstractcltp;

public class Animal extends EtreVivant  implements EtreVivants {
	public Animal(String nom, int age, String genre) {
		super(nom, age, genre);
		
	}
	 public void manger() {
		 System.out.println("L'animal mange");
		 
	 }

}
