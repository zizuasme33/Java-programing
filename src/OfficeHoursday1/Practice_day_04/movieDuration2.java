package OfficeHoursday1.Practice_day_04;
import java.util.Scanner;

public class movieDuration2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Next the length of the movie");
        double movieLength= input.nextDouble();
        double price = 0;

        // = assignment
        // == compare


        if(movieLength ==1){
            price=8.99;
        }
        if(movieLength ==1.5) {
            price = 10.50;

        }if (movieLength == 2){
            price = 12.99;
        }
        if (movieLength == 2.5){
            price = 14.50;

        }
        if (movieLength >= 3.0){
            price = 15.99;

        }
        if (movieLength <= 0){
            System.out.println("Invalid length");
        }else {
            System.out.println("price = " + price);
        }


    }
}
