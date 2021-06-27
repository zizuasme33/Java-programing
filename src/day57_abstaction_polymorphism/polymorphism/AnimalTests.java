package day57_abstaction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {

    public static void main(String[] args) {

        Animal a1 = new Animal(); // not polymorphism, data type and object type are SAME
        a1.makeNoise();

        //Polymorphism - polymorphic way
        // parent type = new child type
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();
        //List list = new ArrayList();
        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        // Polymorphic list of Object. List data type is Parent class
        // object are any of child classes
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());
        for (Animal each : listOfAnimals) {
            each.makeNoise();
        }

    }

}
