package ZebibPractices.Practice_day14.SiamOficeHrPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        fib(8);
        fib(8);

    }
    public static void fib(int num){

        int fibo = 0;

        int [] arr = new int [num +1];
        
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length ; i++) {
            arr[i] = arr[i -1] + arr[i-2];
            
        }

        System.out.println(Arrays.toString(arr));
        // to print individual
//        fibo = arr[arr.length-1];
//        System.out.println("fibo = " + fibo);

        
        

    }
}
