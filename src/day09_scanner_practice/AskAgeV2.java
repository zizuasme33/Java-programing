package day09_scanner_practice;

import java.util.Scanner;// 1st step

public class AskAgeV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // 2nd step scanner object (declaring it)
        System.out.println("How old are you?" ); // 3rd step (ask question)
        int age = scan.nextInt(); //will assign the value to this variables from the keyboard, (int age = 28;)
        System.out.println(age + " - thats great age!");


        //scan.nextInt(); // using scanner ( we put int because we need number to come out)

        //scan.close(); optionally cloth the scanner






    }
}
