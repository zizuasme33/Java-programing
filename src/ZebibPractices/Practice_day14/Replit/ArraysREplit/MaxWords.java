package ZebibPractices.Practice_day14.Replit.ArraysREplit;
import java.util.*;

public class MaxWords {
    public static void main(String[] args) {


        // find max length

//        String [] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
//
//        String maxWords = "";
//
//        for (String each : words){
//            if (each.length() > maxWords.length()) {
//                maxWords = each;
//
//            }
//
//
//        }
//        System.out.println(maxWords);


        // printing 01

//       String arr [] =  {"hello", "how", "are", "you", "doing"};
//
//       for (String each : arr) {
//
//           System.out.println(each.substring(0,3));

      // }

       // printing 03

//        String arr [] =  {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"} ;
//        for (int i = 0; i <= arr.length-2; i+=2) {
//
//                System.out.println("" + arr[i] + ", " + arr[i + 1]);
//            }

        //reverse

        int [] nums = {4, 3, 2, 44, 1, 100, 55};

        for (int i = 0; i < nums.length/2; i++) {
            int temps = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length - i-1] = temps;

        }

      //  System.out.println(Arrays.toString(nums));

    }
}
