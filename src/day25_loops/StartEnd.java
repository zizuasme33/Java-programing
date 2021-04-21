package day25_loops;

import java.util.*;

public class StartEnd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if ( start > end ) {
            System.out.println("Reverse numbering is not supporting");
        }
        for (int i = start; i <= end; i++) {
            System.out.print(i + " " );

        }

    }
}
