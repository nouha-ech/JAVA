package entreprise;

public class Manager extends Employe{
	double prime;
	public Manager(String nom, String poste,double salaire,String matricule, double prime) {
		super(nom,poste,salaire,matricule);
		this.prime = prime;
	}
	
	public void calculerSalaire() {
		double total = salaire + prime;
		System.out.println("le salaire total est " + total);
	}
	public String afficherinfo() {
		return "" + toString()+ "la prime est " + prime + "";
	}
	
	@Override
	public String toString() {
		return  super.toString() + " prime " + prime + "";
	}

}
