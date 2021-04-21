package day37_mestods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading.sum(10,5);
        sum(10.4, 12.4);
        sum(10, 5.5);
        sum((int)4.2, 1, 2); // or sum(4, 1, 2); will print int
        sum("Hello", "World");



    }


    public static void sum(int num1, int num2) {
        System.out.println("sum(int, int)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum (int num1, int num2, int num3) {
        System.out.println("sum(int, int, int)");
        System.out.println("Result = " + (num1 + num2 + num3));

    }

    public static void sum (double num1, double num2) {
        System.out.println("sum(double, double)");
        System.out.println("Result = " + (num1 + num2));

    }
    public static void sum(String str1, String str2) {
        System.out.println("sum(String, string");
        System.out.println("Result = " + (str1 + str2));
    }


}
