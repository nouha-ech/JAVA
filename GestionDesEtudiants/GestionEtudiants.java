package Etu;

import java.util.Arrays;

public class GestionEtudiants {
    private Etudiant[] etudiants;
    int nbEtudiants;

    public GestionEtudiants(int nbetu) {
        etudiants = new Etudiant[nbetu];
        nbEtudiants = 0;
    }

    public void AjouterEtudiant(String nom, int note) {
        if (nbEtudiants < etudiants.length) {
            etudiants[nbEtudiants++] = new Etudiant(nom, note);
            System.out.println("Etudiant ajouté!");
        } else {
            throw new RuntimeException("Impossible d'ajouter l'étudiant : la classe est pleine");
        }
    }

    public void RechercherEtudiant(String nom) {
        for (Etudiant e : etudiants) {
            if (e != null && e.getNom().equalsIgnoreCase(nom)) {
                e.AfficherDetails();
                return;
            }
        }
        throw new RuntimeException("Etudiant non trouvé: " + nom);
    }

    public void TrierEtudiants() {
        Arrays.sort(etudiants, 0, nbEtudiants, (e1, e2) -> e1.getNom().compareToIgnoreCase(e2.getNom()));
        System.out.println("Etudiants triés par nom.");
    }

    public void AfficherEtudiants() {
        for (Etudiant e : etudiants) {
            if (e != null) {
                e.AfficherDetails();
            }
        }
    }
}


