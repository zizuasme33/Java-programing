package OfficeHoursday1.Practice_day_11;

public class MiddleChar {
    public static void main(String[] args) {


        String word = "apple";
        if (word.length() % 2 ==1) {
            // odd
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2 +1));

        }else {
            // even
            int index = word.length();

            System.out.println(word.charAt(index - 1) + " " + word.charAt(index));
            System.out.println(word.substring(index-1, index+1));


        }

    }
}

/**
 * [Middle char]
 * Given a String, write a program to display the middle character of a string
 * a) If the length of the string is even there will be two middle characters. b) If the length of the string is odd there will be one middle character.
 * Ex:
 * Input: elephant
 * Output: The middle characters: ph
 */
