package day24_loops;
import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode; // declare here so that visible for while condition

        do {
            System.out.println("Enter pin code");
            pinCode = scan.nextInt(); // thi is only visible only inside the loop only/ we only declare outside but we assign inside

        } while(pinCode != secretPinCode);

        System.out.println("Welcome to your account");


    }
}
