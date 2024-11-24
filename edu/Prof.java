package edu;

public class Prof extends Personne implements work {
    private String matiere;

    public Prof(String nom, int age, String matiere) {
        super(nom, age);
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Matière: " + matiere);
    }

    @Override
    public void working() {
        System.out.println("prof teach for living");
    }
}

