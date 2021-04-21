package ZebibPractices.Practice_day14.Practice;

public class Logical_operators {
    public static void main(String[] args) {

        int age = 11;
        int age1 = 25;

        if (age >=18 && age1 <= 25 ) { // true
            System.out.println("adult");
        }else {
            System.out.println("teenage");
        }

        // switch

        String floorName = "five";
        switch (floorName) {
            case "first": case "five": case "six":
                System.out.println("floor one");
                break;
            case "second":
                System.out.println("floor 2");
                break;

            case "four":
                System.out.println("floor three");
                break;
            default:
                System.out.println("floor nor available");

        }

        // ternary

        int score = 50;
        String result = (score > 60)? "pass ": "fail";
        System.out.println("result = " + result);

        int  number = -1;
        String negPos = (number > 0 && number <= 5) ? " positive": "negative";
        System.out.println("negPos = " + negPos);

        System.out.println("*********************************");

        //
         String citezen = "usa";
         int age2 = 18;
         boolean canVote = true;

         if (citezen.equals("Eu")) {
             System.out.println("eligible");
             if (age2 >=18) {
                 System.out.println("age is elegible");
                 if (canVote) {
                     System.out.println("person can vote");
                 }else {
                     System.out.println("person can noy vote");
                 }
             } else {
                 System.out.println("under age");

             }
         }else {
             System.out.println("not elegible");
         }







    }
}
