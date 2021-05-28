package ZebibPractices.Practice_day14.SiamOficeHrPractice.ArrayListPractice2;

import java.util.*;

public class ReverseAll {

    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));

        System.out.println(reverseAll(word));

    }

    public static ArrayList<String> reverseAll(ArrayList<String> list) {
        ArrayList<String> reverseWord = new ArrayList<>();

        for (String each : list) {
            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

            }

            reverseWord.add(reverse);
        }
        return reverseWord;
    }
}
