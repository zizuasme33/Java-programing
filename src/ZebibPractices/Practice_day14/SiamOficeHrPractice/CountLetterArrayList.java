package ZebibPractices.Practice_day14.SiamOficeHrPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetterArrayList {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        char targetLetter = 'j';
        int count = 0;

        for (String each : words) {
            for (int i = 0; i < each.length(); i++) {
                char lett = each.charAt(i);

                if (lett == targetLetter) {
                    count++;
                }

            }

        }
        System.out.println("count = " + count);
        

    }
}
