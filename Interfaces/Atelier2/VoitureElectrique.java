package interfaceTP;

public class VoitureElectrique extends Voiture implements Electrique{
	int capaciteBatterie;

	public VoitureElectrique(String marque, String modele, int annee, int nombrePortes, int capaciteBatterie) {
		super(marque, modele, annee, nombrePortes);
		this.capaciteBatterie = capaciteBatterie;
		
	}
	
	@Override
	 public void changerBatterie() {
			System.out.println("la batterie est en chare");
			capaciteBatterie =100;
		}

	@Override
	 public int niveauBatterie() {
			return capaciteBatterie;
		}
	
	@Override
	void afficherDetails() {
		super.afficherDetails();
		System.out.println("Batterie "+ capaciteBatterie + "%");
	}
	}


