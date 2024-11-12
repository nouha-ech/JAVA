package entreprise;

public class Technicien extends Employe {
	int heuresSupplementaires;
	
	public Technicien(String nom, String poste,double salaire,String matricule, int heuresSupplementaires) {
		super(nom,poste,salaire,matricule);
		this.heuresSupplementaires = heuresSupplementaires;
	}
	public int getHeure() {
		return heuresSupplementaires;
	}

	@Override
	public String afficherinfo() {
		return "" + super.afficherinfo() + " , heures Supplementaires: " + heuresSupplementaires + "";
	}
	@Override
	public String toString() {
		return "" + super.toString() + "heuresSupplementaires=" + heuresSupplementaires + " ";
	}

}
