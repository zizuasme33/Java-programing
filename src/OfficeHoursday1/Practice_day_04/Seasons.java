package OfficeHoursday1.Practice_day_04;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the season number:\n1-Spring\n2-Summer\n3-Fall\n4-Winter");
        int season = scan.nextInt();
        int day = 0;
        int night = 0;
        String seasonName = ""; // "" this call empty space

        if (season ==1){
            day = 14;
            night =10;
            seasonName = "Spring";

        }
        if (season ==2){
            day = 16;
            night = 8;
            seasonName = "Summer";

        }
        if (season ==3){
            day = 14;
            night = 10;
            seasonName = "Fall";

        }
        if (season==4){
            day = 12;
            night = 12;
            seasonName = "Winter";

        }
        System.out.println("In " + seasonName + " there is " + day + " hours of dayLight and " + night + " hours of nighttime");


}
}


