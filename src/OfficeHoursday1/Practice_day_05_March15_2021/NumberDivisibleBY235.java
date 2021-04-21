package OfficeHoursday1.Practice_day_05_March15_2021;

public class NumberDivisibleBY235 {

    public static void main(String[] args) {

        int number = 65;
        boolean by2 = number % 2 ==0; // if it equal to zero no remainder
        boolean by3 = number % 3 == 0;
        boolean by5 = number % 5 == 0;
        System.out.println(number + " is divisible by 2 : " + by2 );
        System.out.println(number + " is divisible by 2 : " + by3 );
        System.out.println(number + " is divisible by 2 : " + by5 );



    }
}
