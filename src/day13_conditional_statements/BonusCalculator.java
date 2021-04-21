package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 2500.35;
        if (salesAmount <= 1000) {
            bonus = 50.0; // conditional value assignment
            System.out.println("Good job, you qualified for bonus! " + 50);

        } else {
            bonus = 100.0;
            System.out.println("Great job, you are qualified for full bonus " + 100);
        }
        System.out.println("Your total bonus : $" + bonus);



        int a = 5; // 5
        int b = a++ + a-- + a * 2 + a + ++a; //
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
