package ZebibPractices.Practice_day14.Replit;

import java.util.*;

public class LoopPractice {

    public static void main(String[] args) {


      //  Scanner scan = new Scanner(System.in);
//        int size =  3; //scan.nextInt();
//        int[] num =  {1,2,3};  // new int[size];
//        for(int i =0; i < size; i++) {
//
//            if (num[i] >= size) {
//
//                System.out.println(num[i]);
//
//            }
//        }
        //WRITE YOUR CODE HERE

//        int num [] = {1,2,3};
//
//        for (int each : num) {

//         //   System.out.println("each = " + each);
//            if (each < 2) {
//                System.out.print(each + ", ");
//            }else if (each ==2) {
//                System.out.println(+each );
//            }
//        }

        int nums [] = {4,1,3,12,5};
        int odd=0;
        int even = 0;

        for (int i = 0; i <= nums.length-1; i++) {

            if (nums[i] % 2 == 0) {
                even = nums[i];
                System.out.println("even = " + even);


            }
        }






    }
}
