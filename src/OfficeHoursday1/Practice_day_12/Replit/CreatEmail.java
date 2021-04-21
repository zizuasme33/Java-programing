package OfficeHoursday1.Practice_day_12.Replit;

import java.util.*;

public class CreatEmail {
    public static void main(String[] args) {
        /**
         * Ask user to enter two strings. Both of these strings should be at least 6 character long. If they
         * are shorter than that print “Invalid data” and program should end.
         * If the information provided is valid, you will take the first 4 characters of first string and
         * combine them with the last three characters of the second string. At the end of your combined
         * string add “@cybertek.com” and print the final string as your created email. The final email
         * should be in all lowercase.
         * input:
         * JamesBond
         * Secret
         * output:
         * jameret@cybertek.com
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = scan.nextLine();
        String wordTwo = scan.nextLine();
        String email = "";

        if (wordOne.length() >= 6 && wordTwo.length() >=6) {
            email= wordOne.substring(0,4); // james
            email += wordTwo.substring(wordTwo.length()-3); // secret
            email += "@Cyebertek.com";
            System.out.println(email);

        }else {
            System.out.println("Invalid");
        }


    }
}
