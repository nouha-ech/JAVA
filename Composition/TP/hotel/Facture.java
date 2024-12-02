package TP1;

public class Facture {
	 private Reservation reservation;

	    public Facture(Reservation reservation) {
	        this.reservation = reservation;
	    }

	    public void afficherDetails() {
	        System.out.println("Détails de la facture:");
	        reservation.afficherDetails();
	    }
	}