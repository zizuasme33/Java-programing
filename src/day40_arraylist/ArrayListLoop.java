package day40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(); // Polymorphic way of declaring
        System.out.println(nums); // [] we get empty coz we dont have anything
        System.out.println("size = " + nums.size()); // 0

        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);

        System.out.println("nums = " + nums);
        nums.remove(0);
        System.out.println("nums = " + nums); // 0 index is gone


      //  nums.remove(88); --> index 88 -> IndexOutOfBoundsException

        // remove value
        nums.remove(new Integer(88)); // remove number 88 value. not 88th index
        System.out.println("nums = " + nums);
        
        nums.remove(new Integer(5)); // remove ony one 5 value
        System.out.println("nums = " + nums);

    //    for loop - iterate through all values and print

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // for each loop, and print all in the same line
        for (int each : nums) {  // we dont need get in each loop
            System.out.print(each + " ");
        }








    }
}
