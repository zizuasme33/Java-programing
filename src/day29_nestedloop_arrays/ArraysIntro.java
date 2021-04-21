package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int [] nums = new int [3] ;  // will give us multiple variables
        nums [0] = 5;
        nums [1] = 10;
        nums [2] = 7;
        //print values of array
        System.out.println(" value at index 0 = " +nums [0]);
        System.out.println(" value at index 0 = " +nums [1]);
        System.out.println(" value at index 0 = " +nums [2]);
       // we can use int variable to specify index of
        int i = 0;
        System.out.println(nums [i]); // 5
        i++;
        System.out.println(nums [i]); // 100

        // how to find out of the size of the array
        System.out.println(nums.length);

        // store length of array into len variables

        int len = nums.length;
        System.out.println("len = " + len);

        nums [0] = 100;
        nums [1] = 300;
        //read the value of index  1 amd assign the same to index 2
        nums [2] = nums[1];

        System.out.println("nums[0] = " + nums [0]);
        System.out.println("nums[1] = " + nums [1]);
        System.out.println("nums[2] = " + nums [2]);






    }
}
