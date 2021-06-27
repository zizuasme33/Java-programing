package day57_abstaction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

    // @Override -> static method are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void abcMethodD(int num) {
        System.out.println("absMethodD overridden version is called " + num);
    }
}
