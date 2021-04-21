package ZebibPractices.Practice_day14.Practice_day18;

public class Practice_multibranch {
    public static void main(String[] args) {
        //  1 practice
//        int number = 0;
//        if (number >= 0) {
//            System.out.println(number + " is positive");
//        }else if (number > 0 ) {
//            System.out.println(number + " is negative");
//        }else {
//            System.out.println(number + " is zero");

        //}


        // 2nd practice
        int number = 5;
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuz");
        }else if (number % 5 == 0) {
            System.out.println("Fizz");
        }else if (number % 3 == 0) {
            System.out.println("Buzz");
        }else {
            System.out.println(number);
        }
        // 3rd practice
        int score= 80;
        if (score >= 1 && score <= 40) {
            System.out.println("D");
        }else if (score >=41 && score <= 70) {
            System.out.println("C");
        }else if (score >= 71 && score <= 90) {
            System.out.println("B");
        }else if (score >= 91 && score <= 100) {
            System.out.println("A");
        }

        //  4th practice largest number
        int num1 = 70;
        int num2 = 80;
        int num3 = 60;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 +" is largest");
        }else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is largest");
        }else {
            System.out.println(num3 + " is largest");
        }

        // 5th practice

        int last4SSN = 1234;
        int pinCode = 3333;

        int expLast4SSN = 1234;
        int expPinCode = 333;

        if (expLast4SSN == last4SSN && expPinCode == pinCode) {
            System.out.println("Authentication successful");
        }else if (expLast4SSN != last4SSN) {
            System.out.println("Last SSN does not much");
        }else if (expPinCode != pinCode) {
            System.out.println("Pin code does not much");
        }



    }
}
