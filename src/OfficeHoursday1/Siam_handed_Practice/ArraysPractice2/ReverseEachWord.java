package OfficeHoursday1.Siam_handed_Practice.ArraysPractice2;


import java.util.Arrays;

public class ReverseEachWord {
    /**
     * Given a String, reverse each individual word and print the result Hint: Use a nested loop, split
     */
    public static void main(String[] args) {
        String sentence = "It started to snow in Chicago";
        String [] words = sentence.split("");
        System.out.println(Arrays.toString(words));
        String reversed = words[0];
     //   System.out.println(Arrays.toString(words));
        for (int i = 0; i <  words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    System.out.println(words[j]);
                }
            }




    }
}
