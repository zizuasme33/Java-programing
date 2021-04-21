package OfficeHoursday1.Practice_day_12.Replit;

public class PrefixAgain {
    public static void main(String[] args) {

        /**
         * Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.
         *
         * Assume that the String is not empty and that n is in the range from 1 to str.length().
         *
         * Examples:
         *
         * input: abXYabc
         * input: 1
         *
         * output: true
          */

        String str = "abXYabc";
        int n = 3;

        String prefix = str.substring(0,n); // 0, 2 - ab
        String remaining = str.substring(n); // XYabc

        System.out.println(remaining.contains(prefix));





    }
}
