package ZebibPractices.Practice_day14.Replit;
import java.util.Scanner;
public class Giftcard {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String item = scan.next();
            int balance = 100;

            if (item.equals("Laptop") || item.equals("Smartphone")) {
                System.out.println("Sorry, not enough funds on your gift card!.");

            }else if (item.equals("Blanket")) {
                System.out.println("Thank you for your purchase!");
                balance -=60;
                System.out.println("Your current balance is: " + balance + "$");

            }else if (item.equals("Charger")) {
                balance -= 25;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");

            }else if (item.equals("Headphone")) {
                balance -= 30;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if (item.equals("Pants")) {
                balance -= 50;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if (item.equals("Pillow")) {
                balance -= 40;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if (item.equals("Socks")) {
                balance -= 5;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else if (item.equals("USB cable"))  {
                balance -= 10;
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " + balance + "$");
            }else {
                System.out.println("Ivalid Item");



    }

}
}
