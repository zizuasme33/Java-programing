package day57_abstaction_polymorphism.abstract_class_vs_interface;

public class Runner {

    public static void main(String[] args) {

        /**
         * We cannot create object(instantiate) neither of them.
         AbstractA absA = new AbstractA();
         InterfaceA iA = new InterfaceA();
         */

        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); -> staticMethodE only works with interface.staticMethodE
        ConcreteA.staticMethodC();
    }
}
