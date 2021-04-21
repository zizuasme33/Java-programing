package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args){

       Scanner scan = new Scanner(System.in);
       System.out.println("How isa the weather today?");

       String weather = scan.next();
       //String weather = scan.nextLine();
       System.out.println(weather + " - is a nice day today!");


        // this printing with out scanner
        //String weather = "sunny";
        //System.out.println(weather + " is a nice day today!");


    }
}
