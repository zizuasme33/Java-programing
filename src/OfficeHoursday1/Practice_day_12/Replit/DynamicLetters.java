package OfficeHoursday1.Practice_day_12.Replit;
import java.util.*;

public class DynamicLetters {
    public static void main(String[] args) {
        /**
         * [Dynamic alphabet]
         * • Write a program that will ask ‘upper’ or ‘lower’
         * • If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
         * - Challenge: Also ask if they want to show the alphabet in ascending or order descending
         * - Ascending:A–Zora–z
         * - Descending:Z–Aorz–a
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");

        String upperOrLowe= scan.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = scan.next();
        int starting ;
        int ending;

        if (upperOrLowe.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';

        } else {
            starting = 'a';
            ending = 'z';

        }

        if (ascendingOrDescending.equals("ascending")) {
        for (int i = starting; i <= ending; i++) {
            System.out.print((char) i + " ");
        }

        }else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char) i + " ");
            }
        }

        /**
         * for (int i = 'A'; i <= 'Z'; i++) {
         * System.out.print((char)i);
         */

    }
}
