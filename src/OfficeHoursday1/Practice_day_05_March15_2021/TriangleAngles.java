package OfficeHoursday1.Practice_day_05_March15_2021;

public class TriangleAngles {
    public static void main(String[] args) {

        int angle1 = 100;
        int angle2 = 30;
        int angle3 = 50;
        int sum = angle1 + angle2 + angle3;

        // or
//       if  ((angle1 + angle2 + angle3) == 180)
      // boolean check = (angle1 + angle2 + angle3) == 180;
       // if  ((angle1 + angle2 + angle3) ! == 180) // result will flip go not valid because of !

        if (sum == 180 ) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }


    }
}
