package day09_scanner_practice;
import java.util.Scanner;// import scanner class

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// creat scanner object
        //ask questions
        System.out.println("Enter 2 numbers ");
        int num1 = scan.nextInt();
        int num2= scan.nextInt();
        int result = num1 + num2;// this or
        //System.out.println("Result = " + result or "Result = " + (num1 + num2));
        System.out.println("Result = " + result);

// zizu practice;
        //int ziz1= scan.nextInt();
       // int ziz2 = scan.nextInt();
       //int total = ziz1 + ziz2;
       // String zizii = scan.next();
        //String zizii2 = scan.next();

       //System.out.println("Price for + " +  zizii + ": " + ziz1 + " Price for " +
             //   zizii2 + ":"  +  ziz2 + " Total Price = " + total);

    }
}
