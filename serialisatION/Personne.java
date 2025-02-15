package lesfichiersTP.ex1;

import java.io.Serializable;

public class Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nom;
    private int age;

   
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

  
    public void afficher() {
        System.out.println("Nom : " + nom + ", Âge : " + age);
    }
}

