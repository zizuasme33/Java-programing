package OfficeHoursday1.Practice_day_18_April14;

public class SecondBiggestNumber {

    /**
     * [IQ] Second Biggest Number
     * Given an Array of numbers. Find and print the 2nd biggest number.
     * Note the 2nd biggest should be unique meaning it should be different from the max number
     * Example:
     * Input: [4,3,1,4,5,2,4,8,4,8] Output:
     * 5
     */

    public static void main(String[] args) {

        int [] nums = {4,3,1,4,5,2,4,8,5,8};
        int max = nums[0];        // 8
        int secondMax = nums[0];  // 5

        for(int eachNum : nums) {

            if(eachNum > max){
                secondMax = max;
                max = eachNum;
            }

            if(eachNum > secondMax && eachNum < max){
                secondMax = eachNum;
            }

        }

        System.out.println("max: " + max);
        System.out.println("2nd max: " + secondMax);





    }
}
