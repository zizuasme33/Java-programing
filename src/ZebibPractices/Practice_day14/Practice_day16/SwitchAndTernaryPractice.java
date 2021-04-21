package ZebibPractices.Practice_day14.Practice_day16;

public class SwitchAndTernaryPractice {
    public static void main(String[] args) {


        // 1st practice
//        int floorNum = 3;
//        switch (floorNum) {
//            case 1:
//                System.out.println("Floor 1 selected is has some shopping plazas, verizon, starbucks , lobby");
//                break;
//            case 2:
//                System.out.println("Floor 2 selected is has some companies , Cyberteck, NASA");
//                break;
//            case 3:
//                System.out.println("Floor 3 selected is has some restaurants, Steak house");
//                break;
//            default:
//                System.out.println("Invalid floor");
       // }

        // second practice Cappuccino buyer

//        String size = "tall";
//        double price = 0.0;
//        int calories = 0;
//
//        switch (size) {
//            case "tall":
//                System.out.println("I want tall cappuccino");
//                price = 3.99;
//                calories = 90;
//                break;
//            case "grande":
//                System.out.println("I want grande cappuccino");
//                price = 4.99;
//                calories = 150;
//                break;
//            default:
//                System.out.println("We dont serve this size");
//             //   return; // to exit main method
//
//        }
//        System.out.println("price = " + price);
//        System.out.println("calories = " + calories);

        // Practice 3 bedroom selection

        int numberOfBedroom = 2;
        double startingPrice = 0;

        switch (numberOfBedroom) {
            case 1:
                System.out.println("One bedroom available");
                startingPrice = 1400;
                break;
            case 2:
                System.out.println("Two bedroom available");
                startingPrice = 1500;
                break;
            case 3:
                System.out.println("Three bedroom available");
                startingPrice = 1900;
                break;
            default:
                System.out.println("not available");
                break;// optional
        }

        System.out.println("startingPrice = " + startingPrice);


        System.out.println("===========================");
        // 4th practice on ? (ternary
        
        int score = 100;
        String result= (score < 60) ? "pass" : "fail";

        System.out.println("result = " + result);
        
        
        

    }

}
