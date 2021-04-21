package day33_arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {

        //              0  1   2   3
        int [] nums = {5, 10, 4, 100};
        int [] numsREv = new int [nums.length]; // {0,0,0,0,} by default it has all 0
            //  i = 3,     j = 0
        for (int i = nums.length-1, j =0;  i >=0; i--, j++) {
           numsREv [j] = nums[i];

        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsREv));




    }
}
