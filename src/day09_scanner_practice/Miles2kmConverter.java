package day09_scanner_practice;
import java.util.Scanner;

public class Miles2kmConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("####### MILES TO KM CONVERTER #######");
        System.out.println("Enter miles: ");

        double miles = scan.nextDouble();
        double kilometres = miles * 1.609;
        System.out.println(miles + " miles in kilometres: " + kilometres);

        //double miles = 10.0;
        //double kilometres = miles * 1.609;
        // System.out.println(miles + " miles in kilometres: " + kilometres);

        //practice form today
        //System.out.println("Running miles to kilometres = " );
        //double kilometer = scan.nextDouble();
        //double milesKilo = kilometer / 1.609 ;
        //System.out.println(milesKilo +" Running = " + kilometer  + " miles per Kilometer");





    }
}
