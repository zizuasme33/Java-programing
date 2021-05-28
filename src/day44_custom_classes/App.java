package day44_custom_classes;

/**
 * App class is used as a template for App objects.
 * We are describing app properties and behaviour here. Objects wi;; be able t use them
 */

public class App {
    String name;  // null by default
    double version; // 0.0 by default
    // Open method use name and version variables

    public void open() {
        System.out.println("opening " + name + " app - version = " + version);
    }

}
