package ZebibPractices.Practice_day14.Practice_day24;
import java.util.*;

public class WhileLoops_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Give me 5 dollars");
//        int dollar = scan.nextInt();
//        while (dollar != 5){
//            System.out.println("Give me five dollars");
//            dollar =  scan.nextInt();
//        }
//        System.out.println("Thank you for 5 dollars");

        // 4th practice

//        int secretPinCode = 1234;
//        int pinCode;
//
//        do {
//            System.out.println("Enter a pinCode");
//            pinCode = scan.nextInt();
//        } while(pinCode != secretPinCode);
//
//        System.out.println("Welcome to your account");

        // 5th practice guess number

        Random randomNumber =  new Random();
        int secretNumber = randomNumber.nextInt(50);
        int guessingNumber;
        do{
            System.out.println("Guessing next number");
            guessingNumber = randomNumber.nextInt(50);
            if (guessingNumber > secretNumber){
                System.out.println("wrong, your number is too large");
            }else {
                System.out.println("wrong, your number is too small");
            }
        } while (guessingNumber != secretNumber);
        System.out.println("Congratulations, you won! secret number: " + guessingNumber);

    }
}
