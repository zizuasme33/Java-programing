package ZebibPractices.Practice_day14.Practice_day25;
import java.util.*;

public class Practice_ForLoops {
    public static void main(String[] args) {
        boolean isHungry = true;
        int banana = 0;
        int countToFull = 3;

        while (isHungry) {
            banana++;
            System.out.println("Eating banana ");
            if (banana == countToFull) {
                isHungry = false;
            }
        }

        for (int i = 0; i <= 15; i++) {
            i++;
            System.out.print("* ");
            System.out.println();
        }
        
        int sum = 1;
        for (int count = 5; count >= 1; count--) {
          //  System.out.println(count);
            sum *= count;
            System.out.println(sum);
        }
      // System.out.println(sum * sum);
        System.out.println("1 - 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            }else if (i % 3==0){
                System.out.println("Fizz");
            }else if (i % 5==0) {
                System.out.println("Buzz");
            }
        }
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        if (start > end) {
            System.out.println("Reverse numbering is not supported\"");
        }
        for (int i = start ; i <= end; i++) {
            System.out.print(i + " ");


        }
    }
}
