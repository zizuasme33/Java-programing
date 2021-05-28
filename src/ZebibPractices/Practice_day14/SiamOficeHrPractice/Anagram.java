package ZebibPractices.Practice_day14.SiamOficeHrPractice;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("silent", "listen"));

    }
    public static boolean isAnagram(String one, String two){

        one.toLowerCase();
        two.toLowerCase();
        if (one.length() != two.length()){
            return false;
        }
        int [] count = new int [26];

        for (int i = 0; i < one.length(); i++) {

            char oneLetter = one.charAt(i);
            char twoLetter = two.charAt(i);

            count[oneLetter - 97] = count[oneLetter -97] +1;
            count[twoLetter - 97] = count[twoLetter - 97] -1;

        }
        return Arrays.equals(count, new int [26]);


    }

}
