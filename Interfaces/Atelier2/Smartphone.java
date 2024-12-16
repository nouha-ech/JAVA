package interfaceTP;

public class Smartphone extends AppareilElectrique implements Rechargeable {
	int capaciteBatterie;

	public Smartphone(String marque, int capaciteBatterie) {
		super(marque);
		this.capaciteBatterie = capaciteBatterie;
	}
	
	@Override
	public void recharger() {
		System.out.println("le telephone est en charge");
	}

}
