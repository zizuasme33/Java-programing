package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShoping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk:");
        double price1 = scan.nextDouble();

        System.out.println("Enter price for bread:");
        double price2 = scan.nextDouble();

        System.out.println("Enter price for cucumber:");
        double price3= scan.nextDouble();

        double total =  price1 + price2 + price3;
        System.out.println("Total price: $" + total);


        // Practice from today
        //System.out.println("Enter value for juice ");
       // double juice = scan.nextDouble();
       // System.out.println("juice = " + juice);
       // System.out.println("Enter value for banana ");
      //  double banana = scan.nextDouble();
        //double total1 = juice + banana;
        //System.out.println("total1 = " + total1);



    }
}

