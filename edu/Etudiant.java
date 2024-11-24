package edu;

class Etudiant extends Personne implements work{
    private String specialite;

    public Etudiant(String nom, int age, String specialite) {
        super(nom, age);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public void afficherInfo() {
        super.afficherInfo();
        System.out.println("Spécialité: " + specialite);
    }
    
        @Override
        public void talk() {
            System.out.println("student ask for help");
        }
    
@Override
    public void working() {
    	System.out.println("student study");
    }
}

