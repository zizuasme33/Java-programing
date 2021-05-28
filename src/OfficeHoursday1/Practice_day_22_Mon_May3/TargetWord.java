package OfficeHoursday1.Practice_day_22_Mon_May3;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        /*
        Target word
            Given an ArrayList of Strings and a target word (String)
            print how many times the target word is in the ArrayList
            Ex:
            Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”
            Target:java
            Output:2
         */

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html" , "css" , "java" , "javascript", "selenium"));

        String targetWord = "java";

        int count = 0;
        for (String each : words) {

            if (each.equals(targetWord)){
                count++;
            }
        }
        System.out.println(targetWord + " was found " + count + " times");

    }
}
