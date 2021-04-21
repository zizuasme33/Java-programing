package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {


//        System.out.println(number + " x " + 1 + " = " + (number * 1));
//        System.out.println(number + " x " + 2 + " = " + (number * 2));

        int number = 15;

        if (number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return; // exit main method/stop the program
        }

        for(int i = 1; i <= 10; i++) {
            System.out.println( number + " x "+ i + " = "+ (number * i));



        }


    }
}
