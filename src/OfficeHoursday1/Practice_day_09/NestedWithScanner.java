package OfficeHoursday1.Practice_day_09;
import java.util.Scanner;

public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("Enter a number");

        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Enter a Single word");
            String word = scan.next();
            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length");
            }else {
                System.out.println(word + " is odd length");
            }

        }else {
             // neg

            System.out.println("Enter a character");
            char letter = scan.next().charAt(0);

            if (letter > 'A' && letter <= 'Z') { // if (letter > 65 && letter <= 90)
                System.out.println(letter  + " is Uppercase");

            }else if(letter >= 'a' && letter <='z') {  //  ( letter >= 97 && letter <= 122)
                System.out.println(letter + " is a lowercase letter");
            }else {
                System.out.println(letter + " s not valid letter");
            }


        }

    }
}
