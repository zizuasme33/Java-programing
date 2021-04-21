package OfficeHoursday1.Siam_handed_Practice.Loop3;

import java.util.*;

public class ReverseSecondWord {
    public static void main(String[] args) {

        /**
         * Given a String with three words separated by spaces. Reverse only the
         * second word and return the modified String
         */

//        Scanner scan = new Scanner(System.in);
//        String word = scan.nextLine();
//        int firstSpace = 0;
//        int secondSpace = 0;
//
//        String reverseWord = "";
//
//        firstSpace  = word.indexOf(" ");
//        secondSpace = word.lastIndexOf(" ");
//
//        String newWord = word.substring(firstSpace, secondSpace);
//
//        for (int i = newWord.length()-1; i >= 0; i--) {
//            reverseWord += newWord.charAt(i);
//
//        }
//
//       String fullWord = word.substring(0,firstSpace) + " " + reverseWord + " " + word.substring(0,secondSpace) + newWord;


       // String word = "I love java";
//        int firstSpace = word.indexOf(" ");
//        int lastSpace = word.lastIndexOf(" ");
//        String reverse = "";
//        String newWord = word.substring(firstSpace, lastSpace);
//
//        for (int i = newWord.length()-1; i >= 0; i--) {
//            reverse += word.charAt(i + 1) +"";
//
//
//
//        }
//        System.out.println(word.substring(0, firstSpace) + " " + reverse + "" + word.substring(lastSpace + 1));
//
//

        String word = "anna";
        boolean isPalindrome = true;

        // Q: what if your string has a million character

        for (int i = 0; i < word.length() /2;i++) {


            if (word.charAt(i) != word.charAt(word. length() - 1 -i)) {
                isPalindrome = false;
                break;

            }

        }
        System.out.println(isPalindrome);

        // anna
        //civic



    }
}
