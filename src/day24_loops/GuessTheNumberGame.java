package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
       // System.out.println(randomNumber.nextInt(1001));
        Scanner scan = new Scanner(System.in);

        int secreteNumber = randomNumber.nextInt(101);
        int guessingNumber = 0;

        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secreteNumber){
                System.out.println("wrong, your number is too large");
            }else {
                System.out.println("wrong, your number is too small");
            }

        } while (secreteNumber != guessingNumber);
        System.out.println("congratulations, you won! " + secreteNumber);



    }
}
