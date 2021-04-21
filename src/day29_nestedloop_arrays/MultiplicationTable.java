package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer * inner +"\t");
            }
            System.out.println(); // this will help us to go new line
        }
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {

                System.out.print(inner + " x " + outer + " = " + inner * outer + "\t");
            }
            System.out.println("");
        }

    }
}
