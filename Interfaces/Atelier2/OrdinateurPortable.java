package interfaceTP;

public class OrdinateurPortable extends AppareilElectrique implements Rechargeable {
	int autonomie;

	public OrdinateurPortable(String marque, int autonomie) {
		super(marque);
		this.autonomie = autonomie;
	}
	
	@Override
	public void recharger() {
		System.out.println("l'ordinateur est en charge");
	}
	

}
