package ZebibPractices.Practice_day14.day15;

import java.util.Scanner;

public class Practice_and_operator {

    public static void main(String[] args) {
        // 1st practice on sale free shipping
        boolean freeShipping = true;
        boolean onSale = true;
        boolean hasItem = false;
        String item = "Wooden Spoon";

        if (freeShipping && onSale) {
            System.out.println("Purchase the - " + item);
        } else {
            System.out.println("Next time when item " + item + " on sale");
        }
        System.out.println("==================================");

        // 2nd job offer selector

        String location = "Toronto";
        double salary = 85_000.0;
        boolean remote = true;
        boolean hasBenefit = true;

        if (location.equals("Toronto") && salary == 85_000 && remote && hasBenefit) {

            System.out.println("Accept job offer");
        } else {
            System.out.println("Reject the offer");
        }
        System.out.println("==================================");
        // 3rd  practice OR(||)
        System.out.println("false || true = " + (false || true)); // true
        System.out.println("true || false = " + (false || true)); // true
        System.out.println("==================================");

        // 4th practice OR||

        int apples = 10;
        int oranges = 8;

        if (apples > 11 || oranges > 10) {
            System.out.println("I have enough fruits");
        } else {
            System.out.println("Go to Giant buy fruits");

        }
        System.out.println("==================================");

        // 4th practice CitySelector

        String city = "VA";
        if (city.equals("LA") || city.equals("Toronto")) {
            System.out.println("Willing to relocate LA");

        } else {
            System.out.println("Not considering Seattle");
        }
        System.out.println("==================================");

        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("passed with grade");

        }  else  if (grade == 'D') {
            System.out.println("quality for retake");
        } else if(grade == 'E') {

        } else {
            System.out.println("invalid grade");
        }

        // 4 th dealership

        double budget = 5000.0;
        String model = ("Toyota");
        double carPrice = 4500;

        if (carPrice == 4500 &&  (model.equals("Toyota") || model.equals("Honda"))) {

            System.out.println("Ready to purchase + " + model + ", price = " + carPrice);

        }else {
            System.out.println("Not interested in model = " + model + ", price = " + carPrice);
        }

        // ! not Operator


        System.out.println("!true = " + (!true));
        int age = 5;
        if (!(age < 4)) {
            System.out.println("Need to seat in child seat = " + age);
        }else {
            System.out.println("Can seat in adult seat = " + age);
        }

        boolean isSmokingAllowed =  false;

        if (!isSmokingAllowed) {
            System.out.println("Need to exit and smoke outside");
        }else {
            System.out.println("You can smoke");
        }

        String inputPassword = "abd123";
        String correctPassword = "123abc";

        if (!inputPassword.equals("abc123")) {

            System.out.println("Access granted");
        }else {
            System.out.println("Access denied" );
        }




    }
}


