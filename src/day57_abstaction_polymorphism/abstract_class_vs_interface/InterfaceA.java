package day57_abstaction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    // Interface can oly have PUBLIC and FINAL Variables

    //constant
    public static final String TYPE = "interface";
    double MAX_COUNT = 500; // this is also public static final

    /**
     * ERROR: Interfaces CANNOT have constructors
     public InterfaceA() {
     System.out.println("constructor is not welcome in Interface");
     }
     */

    public abstract void abcMethodD(int num);
    /**
     *starting from java 8 (jdk 1.8)
     * interface can have static and default methods
     */
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }

    default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }

}
