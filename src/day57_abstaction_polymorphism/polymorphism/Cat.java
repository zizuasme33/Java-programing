package day57_abstaction_polymorphism.polymorphism;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Cat is saying <meow meow>");
    }

}
