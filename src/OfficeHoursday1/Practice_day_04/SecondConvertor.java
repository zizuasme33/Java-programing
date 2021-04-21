package OfficeHoursday1.Practice_day_04;
import java.util.Scanner;

public class SecondConvertor {
    public static void main(String[] args) {

            int inputSeconds,hours,minutes,seconds;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter seconds");
            inputSeconds = scan.nextInt(); // 3695

            // how many seconds are in an hour?
            // 60sec = 1 minute
            //60 minute = in 1 hour
            //60 * 60 = 3600


            hours = inputSeconds / 3600;  // 3695 /3600 = 	1 hours: 1
            //inputSeconds = inputSeconds % 3600; // 95
            inputSeconds %= 3600; //  3695 - 3600 = 95
            minutes = inputSeconds / 60; // 95/60 = 1 minutes 1
            inputSeconds %= 60; // 35
            seconds = inputSeconds;
            System.out.println( hours + " hours, " + minutes + " minutes, " + seconds + "seconds ");


        }
    }

