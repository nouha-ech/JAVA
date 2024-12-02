package TP1;

import java.util.ArrayList;
import java.util.List;

public class Ecole {
	    private List<Personne> personnes = new ArrayList<>();

	    public void ajouterPersonne(Personne personne) {
	        personnes.add(personne);
	    }

	    public void afficherTous() {
	        for (Personne personne : personnes) {
	            personne.afficherDetails();
	        }
	    }
	}