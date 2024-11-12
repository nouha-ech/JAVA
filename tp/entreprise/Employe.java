package entreprise;

class Employe {
	protected String nom;
	protected String poste;
	protected double salaire;
	protected String matricule;
	public Employe() {
		nom = "";
		poste = "";
		salaire = 0;
		matricule = "";
	}
	public Employe(String nom, String poste,double salaire,String matricule ) {
		this.nom = nom;
		this.poste = poste;
		this.salaire = salaire;
		this.matricule= matricule;
	}
	public String getNom() {
		return nom;
	}
	public String getPoste() {
		return nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public String getMatricule() {
		return matricule;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public String toString() {
		return "nom Employé: " + nom +", de poste: " + poste +" , de salaire: " +salaire+ ", de matricule:" +matricule+" .";
	}
	public String afficherinfo() {
		return toString();
	}

}
