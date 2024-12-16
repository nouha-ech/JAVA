package interfaceTP;

public class Chien implements Animal {
	
	@Override
	 public void manger() {
			System.out.println("le chien mange");
			
		}
	
	@Override
	 public void dormir() {
			System.out.println("le chien dort");
			
		}

}
