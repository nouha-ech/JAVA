package com.polymorphisme;

public class EmployePleinTemps extends Employe  {

	private double prime ;
	
	public EmployePleinTemps(String nom, double salaireBase,double prime) {
		super(nom, salaireBase);
		this.prime = prime;
	}
	
	public double calculerSalaire() {
		return salaireBase + prime;
	}

}
