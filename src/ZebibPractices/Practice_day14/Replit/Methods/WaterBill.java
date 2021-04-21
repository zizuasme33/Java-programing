package ZebibPractices.Practice_day14.Replit.Methods;
public class WaterBill {
    public static void main(String[] args) {
        System.out.println(waterTax(101));
        isPalindrome(1001);

    }

    public static double waterTax(double units) {
        double bill = 0.0;


        //your code here
        if (units <= 50) {
            bill += units * 0.60;

        } else if (units >= 50 && units < 100) {
            bill += units * 0.90;

        } else if (units >= 100 && units < 151) {
            bill = units * 0.90 + 50;

        } else {
            bill += units * 0.90 + 100;

        }


        //end your code here

        return bill;
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE

        if (num == num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static int[] do_switch(int[] i) {



       int  temp = i[0];
        i[0] = i[3];
        i[3] = temp;
        return i;

    }



}