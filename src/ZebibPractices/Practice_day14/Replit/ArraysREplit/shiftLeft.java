package ZebibPractices.Practice_day14.Replit.ArraysREplit;
import java.util.Arrays;

public class shiftLeft {
    public static void main(String[] args) {
        /* Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
        You may modify and print the given array, or print a new array.`
         */
//
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i = 0; i < size; i++){
//            nums[i] = scan.nextInt();



        int [] nums = {6, 2, 5, 3};
        int leftShift = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];

        }
        nums[nums.length-1] = leftShift;

        System.out.println(Arrays.toString(nums));




    }

}
