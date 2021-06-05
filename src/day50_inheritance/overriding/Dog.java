package day50_inheritance.overriding;

public class Dog extends Animal {
    public void run() {
        System.out.println("Dos is running...");
    }

    @Override
    public void speak() {
        System.out.println("Dog is barking ruff woof");
    }
}
