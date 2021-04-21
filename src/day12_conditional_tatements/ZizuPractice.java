package day12_conditional_tatements;

public class ZizuPractice {
    public static void main(String[] args) {
        // 1sta example for comparison
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeedig = currentSpeed > speedLimit;
        System.out.println(currentSpeed > speedLimit);
        System.out.println("Are you spedign? " + isSpeedig );
        // 45 adding 30
        currentSpeed += 20; // 75
        isSpeedig = currentSpeed > speedLimit;
        System.out.println(currentSpeed > speedLimit);
        System.out.println("Are you spedign? " + isSpeedig);

        double accountBalance = 250.25;
        double itemPrice= 200.9;
        boolean canAford = accountBalance >=itemPrice;
        System.out.println("can i aford = " + canAford);
        System.out.println("============================");

        // 2practice decrease operator by shorthand method;
        accountBalance -= 200.99;
        boolean amBroke = accountBalance <= itemPrice;
        System.out.println("Am I Broke = " + amBroke);



        // 2nd example comparison with char
        char letter1 = 'A';
        char letter2 = 'C';
        boolean check1 = letter1 ==letter2;
         boolean check2 = letter1 >letter2;
        boolean check3 = letter2 > letter1;
        System.out.println("Check is they are equal or greater -" + check1);
        System.out.println("Check is they are equal or greater -" + check2);
        System.out.println("Check is they are equal or greater - " + check3);

        char grade = 'A';
        boolean pass = grade <= 'C';
        System.out.println("Did you pass the exam? = " + pass);
        System.out.println("============================");
        // 3 practice if statement

        if (10 > 5){
            System.out.println("Condition is true");
        }else{
            System.out.println("Condition is false");
        }
        int count = 40;
        if (count > 30) {
            System.out.println("Count is more than 30");
        }else{
            System.out.println("Count is less than 30");
        }

        byte myAge = 28;
        if (myAge >= 18){
            System.out.println("Eligible to vote");
            System.out.println("My Age is greater than or equal 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than or equal");

        }
    }
}
