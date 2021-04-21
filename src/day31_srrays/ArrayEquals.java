package day31_srrays;

import java.util.*;

public class ArrayEquals {
    public static void main(String[] args) {

        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};

        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("nums1 == nums2 - " + Arrays.equals(nums1, nums3));
        System.out.println(nums1 == nums2 ); // check if point to the same object in matching it's false

        if (Arrays.equals(nums1, nums2)) {
            System.out.println("nums 1 and nums2 match");
        }else {
            System.out.println("nums 1 and nums2 mis - match");
        }

        if (Arrays.equals(nums1, nums3)) {
            System.out.println("nums 1 and nums3 match");
        } else {
            System.out.println("nums 1 and nums3 mis - match");

        }

        System.out.println("cars1 == cars2 ---> " + Arrays.equals(cars1, cars2));
        System.out.println("cars1 == cars2 ---> " + Arrays.equals(cars1, cars3));

        if (Arrays.toString(cars2). equalsIgnoreCase(Arrays.toString(cars3))) {
            System.out.println("cars2 == cars3 match - ignoreccase");
        }


    }
}
