package OfficeHoursday1.Siam_handed_Practice.Loop3;

public class PrimeInRange {
    public static void main(String[] args) {

        /**
         * Given a number. Print out all the prime numbers from 2 to that number
         * A prime number is a number that is only divisible by 1 and itself.
         * Ex:Input:50Output:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */

        int num = 50;
        int prime = 0;

        for (int i = 2; i <= num; i++) {
           // prime = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    prime++;
                }
            }

            if (prime == 2) {
                System.out.print( i + ",");

            }
        }

        }


}
