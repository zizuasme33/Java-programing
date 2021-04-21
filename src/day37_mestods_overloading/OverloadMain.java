package day37_mestods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        main(10);
        System.out.println(Arrays.toString(args));


    }
    /**
     * Its yes for INTERVIEW QUESTION we can overload main method
        Overloading main method:
        same name + different parameter
        JDK: does not look for this run
     */
    public static void main(int num) {
        System.out.println("num = " + num);

    }

}
