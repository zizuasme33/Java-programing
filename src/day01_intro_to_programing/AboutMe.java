package day01_intro_to_programing;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        // System.out.println("Hello my name is Zebib, i live in Alexandria, VA.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size");

        int size = scan.nextInt();
        if( size > 10){
         System.out.println("Out of stock");
        } else if(size >= 6){
          System.out.println("Wave in stock");

         }else {
            System.out.println("Size is not in the entire store");


        }
    }
}