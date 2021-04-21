package ZebibPractices.Practice_day14.Practice;
import java.util.Scanner;
public class Withani {
    public static void main(String[] args) {
       // int count = 20;
      //   count = count +15;
      //  System.out.println(count);
        
        double rent = 500;
        rent = rent + 50;
        System.out.println("rent = " + rent);
        
        double fuelPrice = 2.75;
        fuelPrice = fuelPrice - 1.75;
        System.out.println("fuelPrice = " + fuelPrice);
        
        
        double balance = 1200.44;
        balance = 100.0;
        double price = 10;
        double remaining = balance - price;
        System.out.println("remaining = " + remaining);

/**
 * Shorthand Practice
 */

        //int num =10;
       // num = num+1;
        //System.out.println("num = " + num); // 11

        int n = 5;
        n = n + 3;
        n %= 2; //
        System.out.println("n = " + n); // 16

        /**
         * Increment and decrement
         */

        int count = 2;
        count ++; //  post incre
        ++count; // pre incre
        count +=1; // shorthand
        System.out.println("count = " + count); // 5

        int i = 44;
        i--;
        System.out.println("i = " + i); // 43

//        int num = 10;
//        num = num+ 1;
//        num +=1;
//        num++;
//        ++num; //  num = 14

        int apples = 5;
        apples ++; // 6
        ++ apples; // 7

        apples--; // 6
        --apples; // 5
        System.out.println("apples = " + apples);
//      int num1 = 1;
//      num1 ++;
//      ++num1; // total num1 = 3
//
//        int num2 = 5;
//        num2 --;
//        --num2; // num2 = 3
//
//        int nu = 4;
//        int nums = nu++;
//
//        System.out.println(nu);// 5
//        System.out.println(nums); //4

//        int myNumber = 44;
//        myNumber ++;
//        System.out.println("myNumber = " + myNumber); // 45
//        ++myNumber;
//        System.out.println("myNumber = " + myNumber); // 46
//       myNumber = 33;
//        System.out.println( myNumber ++); // 33
//        System.out.println("myNumber = " + myNumber); //  34;

//        int mynumber = 15;
//        int yourNumber = ++mynumber ; // 16 , 16
        //System.out.println(yourNumber + "\n " + mynumber);
        int myNUmber = 99;
        int yourNumber = myNUmber ++;
        System.out.println("myNUmber = " + myNUmber);
        System.out.println("yourNumber = " + yourNumber);
        
        int a = 50;
        int b = 22;
        int c = a++ + ++b; // 50 + 24 / 74
        // a = 51 b = 23
        System.out.println("c = " + c);
        
        // comparison operators
        int num = 1 ;
        num ++;
        ++ num;
        System.out.println("num = " + num); // 3

//        int num1 = 5;
//        num1--;
//        --num1;
//        System.out.println(num1);
//
//
//

        int num1 = 4;
        int num2 = ++ num1;
        System.out.println("num1 = " + num1);// 5
        System.out.println("num2 = " + num2);// 5




        


        
        





    }
}
