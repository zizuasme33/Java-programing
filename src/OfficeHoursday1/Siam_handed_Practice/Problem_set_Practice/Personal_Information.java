package OfficeHoursday1.Siam_handed_Practice.Problem_set_Practice;
import java.util.Scanner;

public class Personal_Information {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ask the user how many people they live with?");
        int people = scan.nextInt();
        boolean cityYouLive = scan.nextBoolean();
        boolean livesDowntown = scan.nextBoolean();
        boolean thoughtMoving = scan.nextBoolean();
        boolean favoriteAnimal = scan.nextBoolean();


        if (people < 2) {
            System.out.println("Live with less than 2 people");
        } else if (people >= 3 && people <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else if (people > 6) {
            System.out.println("\"Live with \"more than 6 people");
        } else {

            if (cityYouLive) {
                System.out.println("Ask the user what city they live in");

            }else if (livesDowntown) {
                System.out.println("Ask the user if the live in downtown");

            }else if (thoughtMoving) {
                System.out.println("do it its great");

            }else {
                System.out.println("You should think about it");
            }
            if (favoriteAnimal) {
                System.out.println("Wow %animal is a great animal");


            }

        }


    }

}
