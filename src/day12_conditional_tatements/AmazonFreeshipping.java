package day12_conditional_tatements;

import java.util.Scanner;

public class AmazonFreeshipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price");
        double totalPrice = scan.nextDouble();
         if (totalPrice >= 25.0){
             System.out.println();
        System.out.println("FREE SHIPPING ELIGIBLE.Your order total: $" + totalPrice);
    }else {
             System.out.println("FREE SHIPPING IS NOT ELIGIBLE.YOur order total is less than: $" + totalPrice);
         }

        System.out.println("THANKS FOR SHOPPING AMAZON");
    }

}
