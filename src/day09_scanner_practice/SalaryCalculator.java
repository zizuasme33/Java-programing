package day09_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {

        System.out.println("Enter hourly rate");
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52/12; // weeklyPay * 4 this may not accurate
        double annualPay = monthlyPay * 12;

        System.out.println("WeeklyPay = " + weeklyPay);
        System.out.println("MonthlyPay = " + monthlyPay);
        System.out.println("AnnualPay = " + annualPay);


    }
}
