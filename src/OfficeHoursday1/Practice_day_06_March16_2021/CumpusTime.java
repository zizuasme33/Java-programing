package OfficeHoursday1.Practice_day_06_March16_2021;

public class CumpusTime {
    public static void main(String[] args) {

        int time = 8;
        if (time < 0 || time > 24) {
            System.out.println("Invalid time");
        } else if (time >= 8 && time <= 23) {
            System.out.println("Campus is open");
        } else {
            System.out.println("Campus is clothed");
        }


    }
}


//Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
//Campus is open from 8 am(8) to 11 pm (23)
//If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
//If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”