package OfficeHoursday1.Practice_day_16;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        /** Max and Min number from Array• (Interview Question)
         * Write a program that can find the maximum number from any given int array•
         * Write a program that can find the minimum number from any given int array
         */

        int [] arr = {3,1,5,-3,10,4,3};

        int min = arr[0];
        int max = arr[0];

        for (int each : arr) {
            // each -> every element | for loop: arr[]

            if (each < min) {
                min = each;

            }

            if (each > max) {
                max = each;
            }
        }
        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

        // for loop
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max//
//            max = arr[i];
//
//            }
//        }






    }
}
