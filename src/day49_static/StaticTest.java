package day49_static;

public class StaticTest {
   static String word = "java";
    public static void main(String[] args) {

        //1) static method cam be called using classname
        StaticMethods.displayMessage("Wooden spoon");
        //1) instance method needs an object to be called
        //StaticMethods.instanceMethods();ERROR
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2) static method can only access other static variables and methods
        System.out.println(word);


    }
}
