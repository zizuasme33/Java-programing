package day19_String_class_vs_object_strings;

import javax.xml.bind.SchemaOutputResolver;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Chicago";
        // equals() method - CASE SENSITIVE COMPARISON
        System.out.println(city.equals("Chicago")); // true
        System.out.println(city.equals("chicago")); // false
        System.out.println(city.equals("Chicago ")); // false

        // EQUALS IGNORE CASE() method- case sensitive comparison
        System.out.println(city.equalsIgnoreCase("Chicago")); // true
        System.out.println(city.equalsIgnoreCase("CHICAGO")); // true
        System.out.println(city.equalsIgnoreCase("ChiCaGo"));// true
        System.out.println(city.equalsIgnoreCase("chiicago")); // false
        System.out.println(city.equalsIgnoreCase("Chi cago")); // false

        if (city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else {
            System.out.println("equals() false");
        }
        if (city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true");
        }else {
            System.out.println("equalsIgnoreCase() false");
        }




    }
}
