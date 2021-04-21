package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculatorV2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter hourly rate");
            double hourlyRate= scan.nextDouble();
            double weeklyPay = hourlyRate * 40;
            double monthlyPay = weeklyPay * 52/12; // weeklyPay * 4 this may not accurate
            double annualPay = monthlyPay * 12;

            System.out.println("WeeklyPay = " + weeklyPay);
            System.out.println("MonthlyPay = " + monthlyPay);
            System.out.println("AnnualPay = " + annualPay);



        }
    }

