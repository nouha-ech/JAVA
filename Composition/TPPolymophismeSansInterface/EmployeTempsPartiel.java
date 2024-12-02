package com.polymorphisme;

public class EmployeTempsPartiel extends Employe{

	private int heuresTravallees ;
	private double tauxHoraire;
	
	public EmployeTempsPartiel(String nom,int heuresTravallees,double tauxHoraire) {
		super(nom, 0);
		this.heuresTravallees = heuresTravallees;
		this.tauxHoraire = tauxHoraire;
	}
	
	public double calculerSalaire() {
		return heuresTravallees * tauxHoraire;
	}

}
