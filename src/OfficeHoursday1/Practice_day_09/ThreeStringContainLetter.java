package OfficeHoursday1.Practice_day_09;

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
 * Challenge: Instead of just checking for 'a' add another variable that can be used to check for any character.
 */

public class ThreeStringContainLetter {
    public static void main(String[] args) {

        String wordOne = "javas";
        String wordTwo = "mouse";
        String wordThree = "apple";
        String biggestWordWithA = "";

        if (wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordOne; // we have Java here
        }
        if (wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordTwo; // no contain a
        }

        if (wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordThree; //
        }
        if (biggestWordWithA.isEmpty()) {
            System.out.println("No words contained A");
        }else {

            System.out.println("Longest word with A: " + biggestWordWithA);
        }
    }
}