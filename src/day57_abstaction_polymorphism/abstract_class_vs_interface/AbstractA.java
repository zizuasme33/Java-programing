package day57_abstaction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {

    // Abstract class can have all variables

    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

    // private abstract void absMethodA() --> Abstract method can't be private, static or final
    public abstract void absMethodA();

    public void methodB() {
        System.out.println("methodB is called");
    }

    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }



}
