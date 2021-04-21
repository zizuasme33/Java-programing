package ZebibPractices.Practice_day14.Practice_day33;

import com.sun.tools.javac.code.Attribute;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

//        String [] friends = {"henok", "Merry", "Akran", "Fke", "Yorda"};
//
//        for (String each : friends) {
//            System.out.println(" ****  Happy Holidays **** " + each);
//        }

        // 2nd example Reverse Array;

        String [] words = {"java", "python", "ruby", "sql"};

//        String reversed = words[0];
//        words[0] = words[3];
//        words[3] = reversed;

      //  System.out.println(Arrays.toString(words));

//        for (int i = 0, j = words.length-1; i < words.length/2; i++, j--) {
//            String swap = words[i];
//            words[i]= words[j];
//            words[j] = swap;

            // OR
            for (int i = 0; i < words.length/2; i++) {
                String rev = words[i];
                words[i] = words[words.length - 1 - i];
                words[words.length - 1 - i] = rev;

        }
        System.out.println(Arrays.toString(words));


        int [] nums = {5, 10, 4, 100};
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;

        }
        System.out.println(Arrays.toString(nums));


        /* 3rd Practice For Loop With 2 Variable  */
        for (int t = 0, d = 4; t < 4; t++, d--) {
            System.out.println("t = "+ t + " d = " + d );
        }

        /* Reversing Array method in interview question   */
        int [] num = new int [3] ;// size of int value is based on length (Starting from 1...)
        num[0] = 2;
        num[1] = 5;
        num[2]= 8;
        System.out.println(Arrays.toString(num));

        /* 4th Split Review */
        String word = "java"; // a is at starting letter will give us empty , ) if a letter at the end will split as normal
        String [] wordArr = word.split("a");
        System.out.println(Arrays.toString(wordArr));

        String word2 = "java1sql2ht4ml";
        String [] wordStr = word2.split("\\d");
        System.out.println(Arrays.toString(wordStr));
        System.out.println(wordStr.length-1);







    }
}
