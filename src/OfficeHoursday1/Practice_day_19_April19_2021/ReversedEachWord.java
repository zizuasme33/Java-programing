package OfficeHoursday1.Practice_day_19_April19_2021;

import day38_metshods.StringUtils;

public class ReversedEachWord {
        /*
        Reverse Each word
        Given a String, reverse each individual word and print the result Hint:
        Use a nested loop, split
        Input:
        It started to snow in Chicago Output:
        tI detrats ot wons ni ogacihC
         */
        public static void main(String[] args) {

            System.out.println(reverseEachWord(" It started to snow in Chicago"));



    }
    public static String reverseEachWord(String str){
            String reverse = "";
            for (String each : str.split(" ")) {
              String eachReverse = "";

              // Here we would reverse each String with a for loop
                // going from the last index to first index

                reverse += StringUtils.reverse(each) + " "; // it imports directly from Util String class

            }
           return reverse.trim();

    }
}
