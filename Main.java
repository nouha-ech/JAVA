package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " ans)";
    }
}


class Material {
    private String type;
    private String description;

    public Material(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return type + " - " + description;
    }
}


class Product {
    private String name;
    private int pages;

    public Product(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return name + " (" + pages + " pages)";
    }
}

public class Main {

    public static void main(String[] args) {
  
         ArrayList<Material> materials = new ArrayList<>();
        materials.add(new Material("Bois", "meubles"));
        materials.add(new Material("Métal", "outils industriels"));
        materials.add(new Material("Plastique", "contenants"));

        System.out.println("Liste des matériaux : " + materials);

        materials.remove(1);
        materials.add(1, new Material("Verre", "verres")); 

        System.out.println("Liste mise à jour : " + materials);

        // HashSet 
        HashSet<Integer> ages = new HashSet<>();
        ages.add(25);
        ages.add(30);
        ages.add(35);
        ages.add(40);

        System.out.println("Ages dans l'ensemble : " + ages);

        // HashMap 
          HashMap<String, Person> persons = new HashMap<>();
        persons.put("Jean", new Person("noha", 25));
        persons.put("Emma", new Person("salma", 30));
        persons.put("Lucas", new Person("reda", 35));

        System.out.println("Personnes dans la carte : " + persons);

        // TreeMap 
         TreeMap<String, Product> products = new TreeMap<>();
        products.put("Livre A", new Product("Livre A", 300));
        products.put("Livre B", new Product("Livre B", 450));
        products.put("Livre C", new Product("Livre C", 500));

        System.out.println("Produits dans la carte : " + products);

        // LinkedList
           LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.addFirst(5);
        numbers.addLast(20);

        System.out.println("Liste des nombres : " + numbers);
    }
}

