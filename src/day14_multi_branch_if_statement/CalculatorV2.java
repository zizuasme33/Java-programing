package day14_multi_branch_if_statement;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        double num1 = scan.nextDouble(); // 44.5
        double num2 = scan.nextDouble(); // 22.5

        System.out.println("enter operator: +, - , *, /, ");
        char operator = scan.next().charAt(0); // -, + . /,

        if (operator == '+') {
            System.out.println(num1 + num2);

        } else if (operator == '-') {
            System.out.println(num1 - num2);

        } else if (operator == '*') {
            System.out.println(num1 * num2);

        } else if (operator == '/') {
            System.out.println(num1 / num2);//67.5 17.2

        } else {
            System.out.println("Invalid operator" + operator);
        }

    }
}
