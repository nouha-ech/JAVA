package edu;

class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficherInfo() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }
    
        public void talk() {
            System.out.println("person can scream");
        }
    }


