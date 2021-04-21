package ZebibPractices.Practice_day14.Replit.ArraysREplit;

import java.util.Arrays;

public class ArrapPractice {
    public static void main(String[] args) {

//       int [] num1 = {1,2,3,4};
//       int i = 0;
//       do {
//           System.out.println(num1[i] + " ");
//           i++;
//       }while (i < num1.length);

        // unique number

//        int[] nums = {1, 2, 2, 5, 5, 6, 8, 8};
//
//
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int k = 0; k < nums.length; k++) {
//                if (nums[i] == nums[k]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println(nums[i]);
//            }
//
//        }

        //  Unique Words

//        String [] words = {"java", "code", "python", "code", "rust", "code", "rust"};
//                String unique = "";
//        for (int i = 0; i < words.length; i++) {
//            int count = 0;
//            for (int j = 0; j < words.length; j++) {
//                if (words[i] == words[j]) {
//                    count++;
//                }
//
//            }
//            if (count ==1) {
//                unique = words[i];
//                System.out.println(unique);
//            }
//
//            }

        // count hom many appears in array and string
       String str = "java";
//        String i = "foo";
//        System.out.println(countAppearance(word, i));
//
//
//    }
//
//    public static int countAppearance(String[] arr, String t) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals(t)) {
//                count++;
//
//            }
//
//        }
//        return count;


        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i) + "")) {
                unique += str.charAt(i);
            }
        }
        System.out.println("unique = " + unique);

       

    }



}
