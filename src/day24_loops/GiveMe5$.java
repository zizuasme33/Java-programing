package day24_loops;
import java.util.Scanner; // Mac : option + enter / Windows Alt + enter

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int dollar = scan.nextInt();
        while (dollar != 5) {
            System.out.println("Give me 5 dollars");
            dollar = scan.nextInt();
           //3dollar++;
        }
        System.out.println("Thank you for 5 dollar");


    }
}
