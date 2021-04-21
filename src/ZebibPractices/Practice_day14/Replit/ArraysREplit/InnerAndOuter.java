package ZebibPractices.Practice_day14.Replit.ArraysREplit;
import java.util.*;

public class InnerAndOuter {
    public static void main(String[] args) {
        /**
         * Given two arrays of ints sorted in increasing order, outer and inner,
         * print out true if all of the numbers in inner appear in outer.
         * Take advantage of the fact that both arrays are already in sorted order.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of inner array");
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];
        System.out.println("enter the index of outer array");

        for(int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }
        System.out.println("enter the index of inner array");

        for(int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
   //     Arrays.sort(inner);
    //    Arrays.sort(outer);

        //Examples:
        //
        //input (outer): 1, 2, 4, 6
        //input (inner): 2, 4
        //
        //output: true
        //copied!
        //input (outer): 1, 2, 4, 6
        //input (inner): 2, 4
        //
        //output: true
        //input (outer): 1, 2, 4
        //input (inner): 6, 5
        //
        //output: false

            for (int i = 0; i < inner.length; i++) {
                // i =0 to i = length -1
          //      if (Arrays.binarySearch(outer, inner[i]) < 0){
                    System.out.println(false);
                    return;
//                    // we are in the last round loop
//                }else if (i == inner.length-1) {
//                    System.out.println(true);
//
             //  }

            }
      //  System.out.println(true);

    }

}
