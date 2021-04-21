package day09_scanner_practice;
import java.util.Scanner;

public class zizuPracticeDay09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//Creat scanner object (Scanner scan - declare a variable data of Scanner such us, String name; Int age;  )
        System.out.println("How old are you?"); // ask question
        int age = scan.nextInt(); // nextInt - accept int value(whole number) fro keyboard
        System.out.println(age + " - that's great age!");


        

    }
}
