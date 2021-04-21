package ZebibPractices.Practice_day14.Practice_day13;
//import java.util.Scanner;

public class ScannerCalculator_Practice {
    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Enter 2 numbers");

       // int num1 = scan.nextInt();
       // int num2 = scan.nextInt();
       // System.out.println("Enter operator");
        //char operator = scan.next().charAt(0);

       // if (operator == '+') {
            //System.out.println(num1 + num2);
        //}else if (operator == '-') {
            //System.out.println(num1 - num2);

       // }else if (operator == '/') {
            //System.out.println(num1 / num2);

        //}else if (operator == '*') {
           // System.out.println(num1 + num2);
        //}else {
       //     System.out.println("Invalid operator");
       // }
        
        // && And operators;
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && false );

        System.out.println("==============================");

        // with if Condition

        int apples = 7;
        int banana = 4;
        boolean check = apples > 5  && banana > 2;
        System.out.println("check = " + check);

        if (apples > 5 && banana >3 ) {
            System.out.println("we have enough apples and banana");
        }else {
            System.out.println("Go to walmart and buy fruits");
        }
    }
}


