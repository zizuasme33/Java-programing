package day12_conditional_tatements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 5_5; //55 ( _it should be around the number)
        int currentSpeed = 4_5; //45
        System.out.println(currentSpeed > speedLimit); // false 45 not more 55
        System.out.println(currentSpeed > speedLimit);// false 55 not less than 45
        System.out.println(currentSpeed > speedLimit);// false 55 not equal to 45

        // or  boolean = speedLimit < currentspeed;

        boolean isSpeeding = currentSpeed > speedLimit;// true if speeding, false if not speeding
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        // 45 adding 20 = 65

        currentSpeed += 20; // increase to 65
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));
        // or
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford); // true
        
        
        //decrease balance by itemPrice. using shorthand operator
        accountBalance -= 200.99;
        boolean isBrook = accountBalance <= itemPrice;

        System.out.println("Am I broke? - " + isBrook);
        
        

        String name = "5";
        if (name.equals("6")) {

            System.out.println("name = " + name);
        }else{
            System.out.println("false = " + name);
        }
            
                
      






    }
}
