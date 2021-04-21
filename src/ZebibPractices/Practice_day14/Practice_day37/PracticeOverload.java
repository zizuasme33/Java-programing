package ZebibPractices.Practice_day14.Practice_day37;

public class PracticeOverload {
    public static void main(String[] args) {

        /**
         * For Interview Question
         * Can you overload a main method?
          */
        System.out.println("Yes we can overload main method using different parameter");


        // Overload Practice

        sum(10, 3);
        sum(10.5, 20.5);
        sum("zebib", "Tewelde");

    }
    public static void sum(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("result = " + result);
    }
    public static void sum (double num1, double num2) {
        System.out.println("double = " + num1 + num2);

    }
    public static void sum (String name, String last) {
        System.out.println("Full name = " + name + " " + last);
    }
}
