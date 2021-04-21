package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(8);
        int num = 999;
        count(num);
        String word = "wooden spoon";
        count(word.length());// length will give us int value

        printAge(1992);
        printAge(1988);

        int birthYear = 2001;
        printAge(birthYear);


    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    /**
     * method name: PrintAge
     * param/input: int year
     * Birth year: 1984 : Age:.0.
     */

    public static void printAge (int year) {
        int age = 2021-year; // calculate age
        System.out.println("Birth year: "+ year + ". Age: " + age);
    }

}
