package OfficeHoursday1.Practice_day_08;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2; // we dont need to cast it b/c its int can go to long

        // (3 + 2) * 2 / 3 % 2;
        // 5 * 2 / 3 % 2
        //10 /3 % 2
        // 3 % 2
        // 1
         // at the end
        //a = 2
        // b = 2
        // c = 1


        short c2 = (short) ((a-- + b) * 2 / 3 % 2);




    }
}
