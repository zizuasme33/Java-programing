package OfficeHoursday1.Siam_handed_Practice.Loop3;

import java.util.*;

public class CAmelCase {
    public static void main(String[] args) {

        /**
         * Given a String of words that follow Camel Case convention.
         * FindandprinthowmanywordsareinthegivenString.
         * Every word, except the first word, begin with an uppercase letter.
         * The other characters of the word will be lowercaseEx:
         * Input:thisHasManyWordsToFindOutput: 6
         */

        Scanner scan = new Scanner(System.in);
        String camelCase = scan.next();
        int count = 0;
        for (int i = 0; i < camelCase.length(); i++) {
            if (camelCase.charAt(i) >= 'A' && camelCase.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(count);

    }
}
