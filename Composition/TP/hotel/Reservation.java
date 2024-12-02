package TP1;

public class Reservation {
    private String client;
    private Chambre chambre;

    public Reservation(String client, Chambre chambre) {
        this.client = client;
        this.chambre = chambre;
    }

    public void afficherDetails() {
        System.out.println("Client: " + client);
        chambre.afficherDetails();
    }
}