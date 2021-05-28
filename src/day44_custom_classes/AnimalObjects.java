package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {

        // purpose of this class is to creat object
        Animal animal = new Animal(); // creating object by using attributes and behaviours
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak();

        // creat object cheetahObj

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah"; // change value / reassign to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");





    }
}
