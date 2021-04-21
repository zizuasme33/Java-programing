package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        //int cents = 255;
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainCents = cents % 100;
        System.out.println("Cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainCents = " + remainCents);

        System.out.println("In " + cents+ " cents : " + dollars + " dollars " + remainCents + " cents");
        
        int cents1 = scan.nextInt();
        System.out.println("cents1 = " + cents1);
        int dollar2 = cents / 100;
        System.out.println("dollar2 = " + dollar2);
        int remainCents1 = cents % 100;
        System.out.println(" In remainCents1 = " + remainCents1);

    }
}
