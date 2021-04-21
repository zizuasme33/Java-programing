package day25_loops;

public class SumOfNumber {
    public static void main(String[] args) {

        int sum = 0;
        // 0 + 1 + 2 + 3 + 4 + 5 = ( 1 - 5 ) = 15
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i; // sum = sum = i;
        }
        System.out.println("sum = " + sum);


    }
}
