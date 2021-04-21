package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {

        String word = "java"; // if a at the starting will give as empty "", if at the end i will not give us anything
        String [] array = word.split("a");
        System.out.println((array.length)); // 2
        int countOfA = array.length-1;
       // array.length-1 (1) this will give us word array splited size is 2 - 1 a that removed
        
        if (word.endsWith("a")) { // if ends with a, add one more.
            countOfA ++;
        }
        System.out.println("countOfA = " + countOfA);


        System.out.println("----- Split with Empty String ---------- ");

        String  [] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);


        /// REGULAR EXPRESSION

        String word2 = "java1sql2ht4ml";
        String [] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));
        System.out.println(strArr2.length);


       word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " + word2);


        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }



    }
}
