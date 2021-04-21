package day12_conditional_tatements;

import java.util.Scanner;

public class zizuPractice_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Calculating My Age,");
        //int myBirthday = scan.nextInt();
        //int currentYear = scan.nextInt();
        //int myCurrentAge = currentYear -myBirthday;
        //System.out.println("myCurrentAge = " + myCurrentAge);
        //if(myCurrentAge == 34){
           // System.out.println("My age calculate correct");
        //}else{
           // System.out.println("My age is not calculate correct");
        //}

        System.out.println("Calculating My exam Mark");
        int examPassing= scan.nextInt();
        int passingMark = scan.nextInt();
        if(examPassing >= 75){
            System.out.println("I will pass the exam");
        }else{
            System.out.println("I will fail the exam");
        }
        System.out.println( "I will pass if i got " + examPassing);
    }
}
