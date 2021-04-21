package OfficeHoursday1.Practice_day_03;

import java.util.Scanner;

//PIC : Pkage ---Import

public class Rectangle {
    public static void main(String[] args) {

        // HArd codes values
        //double length = 5;
       // double width = 3;

        //Dynamic with scanner

        System.out.println("Enter your length");
        Scanner scan = new Scanner(System.in);
        double length = scan.nextDouble();
        System.out.println("Enter your width");
        double width = scan.nextDouble();


        double perimeter = 2 * (length + width);
        double area = length * width;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);




    }
}
