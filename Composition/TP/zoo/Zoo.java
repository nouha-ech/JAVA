package TP1;

import java.util.ArrayList;
import java.util.List;

class Zoo {
    private List<Animal> animaux = new ArrayList<>();

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void faireParlerTous() {
        for (Animal animal : animaux) {
            animal.parler();
        }
    }
}