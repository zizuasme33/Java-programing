package OfficeHoursday1.Siam_handed_Practice.Loop3;

import java.util.Random;

public class GenerateARandom {
    public static void main(String[] args) {

        /**
         * Generate a random number that is six digits long. Each digit in this
         * number should be unique, meaning the number 6 digit number should
         * have 6 different character numbers that make it up. Print the number.
         * HINTS: Loops, Strings, Random
         */

        String source = "123456789";
        Random random = new Random();
        String newGenerate = "";
        String unique = "";

        for (int i = 1; i < source.length(); i++) {
            int index = random.nextInt(6); // order the object
            newGenerate = source.charAt(index) + "";
            System.out.println(index);
             if (newGenerate.charAt(index) == source.charAt(index)) {
                 newGenerate += source.charAt(index);
                 unique += newGenerate;


             }

        }






    }
}
