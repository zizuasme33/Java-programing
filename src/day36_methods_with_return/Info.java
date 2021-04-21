package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {

        fullName(); // if we want to print inside the custom method we can call it from here
        //                                  "Mike Smith"
        System.out.println("Full name = " + fullName());
        System.out.println("IsMarried = " + isMarried());
        System.out.println("Age = " + getAge());

        System.out.println("Birth year = " + getRandomYear()); // dynamic. different year each time

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if (isMarried()) {
            System.out.println("married");
        }else {
            System.out.println("single");
        }


    }

    public static String fullName() {
       // System.out.println("Inside full name method");
        return "Mike Smith";

    }
    public static boolean isMarried() {
        return false;
    }
    public static int getAge() {
        int age = 35;
        return age; // return 35;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
