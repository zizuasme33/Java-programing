package OfficeHoursday1.Siam_handed_Practice;

public class AccountNumber {
    public static void main(String[] args) {

        String accountNumber = "a2bcdef";
        if (accountNumber.startsWith("a2")) {
            System.out.println("Valid " + accountNumber.length() + " digit account number");
        }else {
            System.out.println("Invalid 7 digit account number");
        }
        if (accountNumber.startsWith("a5123")) {
            System.out.println("Valid " + accountNumber.length() + " digit account number");
        }else {
            System.out.println("Invalid 5 digit account number");
        } if (accountNumber.startsWith("bz122")) {
            System.out.println("Invalid account number");
        }

        String word1 = "java";
        String word2 = "computer";
        String word3 = "mouse";



    }
}

/**
 * Given three String variables of some text find and print the longest word that also contains 'a'
 *
 *     Ex:
 *         "java"
 *         "mouse"
 *         "computer"
 *         Output: java
 *     Ex:
 *         "java"
 *         "mouse"
 *         "apples"
 *         Output: apples
 *
 * Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character
 */

/**
 /**
 Declare a variable account number (String). You will check if these account numbers are valid.
 - If the account number begins with a “2” the account number should be 7 characters long
 -> Print: "Valid 7 digit account number"
 Otherwise: "Invalid 7 digit account number"
 - If the account number begins with a “5” the account number should be 10 characters long
 -> Print: "Valid 5 digit account number"
 Otherwise: "Invalid 5 digit account number"
 — If the account number does not begin with a 2 or a 5
 -> Print "Invalid account number"
 */