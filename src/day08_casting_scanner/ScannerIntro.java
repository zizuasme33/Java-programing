package day08_casting_scanner;

import java.util.Scanner; // 1st step (importing the scanner)

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 2 step ( creat scanner object)

        System.out.println("Please enter your name:"); // 3 step (ask a question)

        String firstName = scan.next(); // step 4 (
        System.out.println("nice to meet you, " + firstName);




    }
}
