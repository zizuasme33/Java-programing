package ZebibPractices.Practice_day14.Replit.ArraysREplit;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {

        /**

         Write a program that will find out shortest words in the given string str.
         If there are few words that are evenly short, print them all.
         Use split method in order to split str string variable and create an array of strings.
         Print array with Arrays.toString() method. Sort array before printing.
         Hint: Split values by comma: split(", ");

         input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

         output: [cat, old, ray]
         */

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] words = str.split(", ");

        String shortestWord = "";
        int count = words[0].length();


        for (int i = 0; i < words.length; i++) {
            if (count == words[i].length()) {
                shortestWord += " " + words[i];

            } else if (count > words[i].length()) {
                shortestWord = words[i];
                count = words[i].length();

        }
        String[] shortest = shortestWord.trim().split(" ");
        Arrays.sort(shortest);
        System.out.print(Arrays.toString(shortest));
    }
        /*   String[] strArString[] words = str.split(", ");

        String shortestWord = "";
        int count = words[0].length();


        for (int i = 0; i < words.length; i++) {
            if (count == words[i].length()) {
                shortestWord += " " + words[i];

            } else if (count > words[i].length()) {
                shortestWord = words[i];
                count = words[i].length();

        }
        String[] shortest = shortestWord.trim().split(" ");
        Arrays.sort(shortest);
        System.out.print(Arrays.toString(shortest));r = str.split(", ");
            String shortest = "";
int count = strArr[0].length();
            for (int i = 0; i < strArr.length; i++){
                if (count == strArr[i].length()) {
                    shortest += " " + strArr[i];}
                else if(count > strArr[i].length()) {
                    shortest = strArr[i];
                count = strArr[i].length();}

            }
            String[] shortestArr = shortest.trim().split(" ");
            Arrays.sort(shortestArr);
            System.out.print(Arrays.toString(shortestArr));
        }*/

        // reverse replit

//        String sentence = "Java is fun";
//        String [] words = sentence.split(" ");
//       // System.out.println(Arrays.toString(words));
//
//        String reversed = "";
//
//        for (int i = words.length-1; i >= 0; i--) {
//            reversed += words[i] + " ";
//        }
//        System.out.println("reversed = " + reversed);

        /*  find each first and last letter replit */

//       String [] words =  {"hello", "why", "by", "apple" , "note"};
//
//       String newWord = "";
//        for (String each : words) {
//           newWord += (each.charAt(0) + "" + each.charAt(each.length() - 1)) + " ";
//
//        }
//        System.out.println(Arrays.toString(newWord.split(" ")));


        /* Split email in replit  */
//
//        String email = "info@cybertekschool.com";
//        String [] words = email.split("@");
//        if (words.length ==2) {
//            System.out.println("Email id: " + words[0]);
//            System.out.println("Email domain: " + words[1]);
//
//        }else {
//            System.out.println("invalid email");
//        }

        /* Given an array nums with 7 integers every element is repeated twice - except one.
        Find that element and print it to console.   */

//        int [] nums = {1, 1, 2, 3, 4, 3, 4};
//
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int each : nums) {
//                if (each == nums[i]){
////                    count++;
////                }
////            }
//
//            if (count ==1) {
//                System.out.println(nums[i]);
//            }
//        }
//
//        for (int i = 0, j = 0; i < nums.length; i++, j++) {
//          int count = 0;
//
//            if (nums[j] == nums[i]) {
//                count++;
//            }
//            if (count ==1) {
//                System.out.println(nums[i]);
//
//        }
//
//        }
    }
}
