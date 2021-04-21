package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars = cars + 2;// longhand
        System.out.println("cars in parking lot = " + cars);
        cars += 5;// shorthand
        System.out.println("cars in parking lot = " + cars);

        // 6 cars left the parking lot
        //cars = cars - 6;
        cars -= 6;
        System.out.println("cars in parking lot = " + cars);
        cars = cars - 1;//tradition printing
        cars -= 1; // shorthand printing
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot  = " + cars);

        // String will concatenating
        String word = "Java";
        System.out.println("word = " + word);
        word = word +  " programing";
        System.out.println("word = " + word);
        //add fun
        word += " is fun ";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun. ";
        word += selenium;
        System.out.println("word = " + word);

        word += 12345;// add 12345 to word
        System.out.println("word = " + word);

        char letter = 'A'; // letter
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        // Add 'J' letter
        letter += 1;
        System.out.println("letter = " + letter);
        
        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //early bird is 50 off.
        //parkingFee = parkingFee / 2;
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);
        // weekend parking is free
        parkingFee -= parkingFee; // parkingFee = parkingFee - parkingFee
        System.out.println("weekend parking fee = " + parkingFee);






    }
}
