package day38_metshods;

/**
 *INTERVIEW QUESTIONS
 */

public class RecursiveMethod {
    public static void main(String[] args) {
        printNums(1);

    }

    public static void printNums(int num) {
        System.out.print(num + " ");
        num++;
        if (num <= 100) {
            printNums(num);
        }
    }
}