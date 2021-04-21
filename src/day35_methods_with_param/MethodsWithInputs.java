package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count); // num = count;


        greetByName("Zebib");
        greetByName("Maranatha");
        String name = "Suleyman";
        greetByName(name);



    }

    public static void displayValue(int num) {
        System.out.println("The value is " + num);
    }



    /**
     * method name: greetByName
     * param/input String name
     * It prints "Hello {name}, how re you today?
     */
    public static void greetByName (String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }


}
