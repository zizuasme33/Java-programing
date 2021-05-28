package ZebibPractices.Practice_day14.SiamOficeHrPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class fourOrless {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray"));

        ArrayList<String> shortWords = new ArrayList<>();

        for (String each : list) {
            if (each.length() <= 4) {
                shortWords.add(each);
                
            }
            
        }
        System.out.println("shortWords = " + shortWords);
        
    }
}
