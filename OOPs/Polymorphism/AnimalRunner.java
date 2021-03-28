package OOPs.Polymorphism;

import java.util.ArrayList;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal parrot = new Parrot();
        Animal tiger = new Tiger();
        Animal cow = new Cow();
        Animal parrot2 = new Parrot();

        ArrayList<Animal> animal_list = new ArrayList<Animal>();
        animal_list.add(parrot);
        animal_list.add(tiger);
        animal_list.add(cow);
        animal_list.add(parrot2);

        for(int i = 0; i < animal_list.size(); i++) {
            animal_list.get(i).makeSound();
        }

        for(Animal animal : animal_list) {
            animal.makeSound();
        }
    }
}