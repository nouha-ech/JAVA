package TP1;

public class Personne {
	 protected String nom;
	    protected int age;

	    public Personne(String nom, int age) {
	        this.nom = nom;
	        this.age = age;
	    }

	    public void afficherDetails() {
	        System.out.println("Nom: " + nom + ", age: " + age);
	    }
	}