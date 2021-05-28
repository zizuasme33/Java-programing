package OfficeHoursday1.Practice_day_21_April27_2021;

import java.util.Arrays;

public class Anagram {
    /*
        IQ [Anagram]

        Create a method that will accept two Strings. Check if the two Strings are anagram of each other. If they are anagram return true otherwise return false.

        Anagram means the characters of the words are the same, but rearranged in different orders

        For example:
        listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'
     */
    public static void main(String[] args) {

        System.out.println(isAnagram("abc", "cba"));
        System.out.println();

    }
    // toCharArray - sort - equal ?
    // loop through one String -> remove the character that you iterate through
    // in the other string -> if empty the 2nd String isEmpty?

    public static boolean isAnagram(String one, String two){
        if (one.length() != two.length()) {
            return  false;
        }
        one = one.toLowerCase();
        two = two.toLowerCase();

        int [] count = new int [26];

        // listen  > l +1, i+1, s+1,
        // silent > s-1, i -1, etc

        // a - 0, b = 1, c = 2
        // z -> 25

        for (int i = 0; i < one.length(); i++) {
            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);

            count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromTwo - 97] -1;
         //   System.out.println(Arrays.toString(count));
;

        }

        return Arrays.equals(count, new  int [26]);


    }

}
