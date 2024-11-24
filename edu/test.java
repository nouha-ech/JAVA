package edu;

public class test {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("nouha", 22, "dsi");
        etudiant1.afficherInfo();

        etudiant1.setNom("nohaila");
        etudiant1.setAge(23);
        etudiant1.setSpecialite("dev");

        System.out.println("\nInformations mises à jour :");
        etudiant1.afficherInfo();
        
        Personne p= new Personne(null, 0);
        Personne e = new Etudiant(null, 0, null);
        Prof pr = new Prof(null, 0, null);
        

        p.talk();
        e.talk();
        
        pr.working();
        ((Etudiant) e).working();  // only worked when we did casting
        
    }
}
