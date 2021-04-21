package ZebibPractices.Practice_day14.Replit.ArraysREplit;
import java.util.*;

public class fibPractice {
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
         fib(num);



    }
    public static void fib (int num) {
        int fibonacci = 0;
        int [] fibArray = new int [num+1];

        fibArray[1] = 1;

        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[i -2] + fibArray[i-1];

        }
        fibonacci = fibArray[fibArray.length-1];
        System.out.println(fibonacci);

        String word =  "java";

        System.out.println(word.startsWith("jav"));

    }
}





// Fibonacci:
//  0,   1,     2,      3,      4,      5,      6,     7 ,      8
//  0,   1,     1,      2,      3,      5,      8,      13,     21

// i = 2 ==> (i - 2) + (i-1)
// int [] fibArray = new int [num+1] ;
//System.out.println(Array.toString(fibArray)) // by default = {0,0,0,0,0,0,0,0,0}
// fibArray [0] = [0];
// fibArray[1] = 1 // we can assign it anywhere
// for (int i = 2; i < fibArray.length; i++) {
// fibArray[i] = fibArray[i-2] + fibArray[i-2];
// System.out.println(Array.toString(fibArray)) {0,0,0,0,0,0,0,0,0},
// fibArray[fibArray.length-1]
// }



/**
 * Complete a method fib() that will compute Fibonacci numbers
 *
 * In the Fibonacci series, the next number is the sum of previous two numbers.
 * For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc...
 * The first two numbers of the Fibonacci series are 0 and 1.
 * (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)
 *
 * You are given a number num, print n-th Fibonacci Number.
 */
