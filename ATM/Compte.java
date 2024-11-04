package atm;

import java.util.ArrayList;

class Compte {
    private String user;
    private String mdp;
    private Double solde;
    private ArrayList<String> HistoriqueDesTransactions;  

    // Constructor
    public Compte(String user, String mdp, Double soldeinitial) {
        this.user = user;
        this.setMdp(mdp);
        this.solde = soldeinitial;
        this.HistoriqueDesTransactions = new ArrayList<>();
        HistoriqueDesTransactions.add("Votre compte est créé avec un solde de " + soldeinitial + " dirham.");
    }

    // Getters
    public String getUser() {
        return user;
    }

    public Double getSolde() {
        return solde;
    }

    // Methods
    public void depot(Double montant) {
        solde += montant;
        HistoriqueDesTransactions.add("Montant ajouté: " + montant + " dirham");
    }

    public boolean retrait(Double montant) {
        if (montant > solde) {
            System.out.println("Solde insuffisant");
            return false;
        } else {
            solde -= montant;
            HistoriqueDesTransactions.add("Retrait de " + montant + " dirham");
            return true;
        }
    }

    public void voirHistorique() {
        System.out.println("Historique de vos transactions:");
        for (String transaction : HistoriqueDesTransactions) {
            System.out.println(transaction);
        }
    }

    public void calculInteret(double tauxInteret) {
        double interet = solde * (tauxInteret / 100);
        solde += interet;
        HistoriqueDesTransactions.add("Ajout d'intérêt: " + interet + " dirham");
    }

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
}
