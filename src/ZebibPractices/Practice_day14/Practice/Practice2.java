package ZebibPractices.Practice_day14.Practice;

public class Practice2 {
    public static void main(String[] args) {

        System.out.println( 10 > 5); // true
        System.out.println( 20 != 5);//

        String word = "java";
        System.out.println(!word.equals("java")); // false

        int n1 = 5;
        int n2 = 3;
        System.out.println(n1 == n2); // false
        System.out.println(n1 > n2);// true

        int age = 2;
        boolean noMoreToddler = (age > 2);
        System.out.println("noMoreToddler = " + noMoreToddler); // false

         int age1 = 67;
        System.out.println(age > 65); // true

        // if statement

        int num1 = 120000; // 120000

        // declare 3 variable
        int currentSpeed = 50;
        int speedLimit = 55;
        if (currentSpeed > speedLimit) {
            System.out.println("is speeding");
            currentSpeed -= 5;
        }else {
            System.out.println("not speeding");
            currentSpeed +=5;

        }
        System.out.println("currentSpeed = " + currentSpeed);

        // char value

        char letter = 'a';
        char letter1 = 'b';
        if (letter > letter1) {
            System.out.println("a is big ");
        }else {
            System.out.println("b is big");

        }

        if ( 5 > 10) {
            System.out.println("5 is smaller");
        }else {
            System.out.println("10 is bigger");

        }

        char grade = 'A';
        if (grade == 'A') {
            System.out.println("exam pass");

        }else if (grade == 'b') {
            System.out.println("grad is good");
        }else {
            System.out.println("exam fail");
        }


        // amazon free shipping

        int totalPrice = 15;
        if (totalPrice >= 25) {
            System.out.println("free shipping");
        }else {
            System.out.println("not eligible for free shipping");
        }

        // day 13

        boolean isHungry = false;
        if (isHungry) {
            System.out.println("yes I am hungry");

        }else {
            System.out.println("no I am not ");
        }

         char letter3 = 'Q';
        if (letter3 == 'Q') {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        String secretPincode = "abcd";
        String inputPincode = "abcd";
         if (secretPincode.equals(inputPincode)) {
             System.out.println("welcome to your account");
         }else {

         }

         // multibranch if statement

         int day = 3;
         if (day == 1) {
             System.out.println("monday");
         } else if (day == 2) {
             System.out.println("tuesday");
         }else if (day == 3) {
             System.out.println("wednesday");
         }else {
             System.out.println("day is not valid ");
         }





    }
}
