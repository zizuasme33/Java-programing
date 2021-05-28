package day44_custom_classes;

/**
 * This class is used to create objects of App class
 */

public class MyApps {
    public static void main(String[] args) {

        // String app1 = "uber"; this is string object, just characters

        App uberApp = new App(); // creating new object
        // Uber, 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); // call open method using object variables
        uberApp.version= 4.0;
        uberApp.open();

        /**
         * creat more objet and practice
         */



    }

}
