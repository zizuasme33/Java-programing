package day37_mestods_overloading;

public class DaySelector {
    public static void main(String[] args) {

        System.out.println(getDayNAme(1));
        System.out.println(getDayNAme(5));
        System.out.println(getDayNAme(10));


        // loop from 1 to 8 and call getDayName with loop variable;
        for (int i = 1; i < 9; i++) {
            System.out.println(i + " = " + getDayNAme(i));

        }

        // Store detDayName into variable, and print variable
        String today = getDayNAme(6);
        System.out.println("today = " + today);
        String someDay = getDayNAme(0);
        if (someDay == null) {
            System.out.println("someDay is null for invalid day");
        }

        System.out.println(getDayNameV2(2));




    }


    public static String getDayNAme (int day) {
        switch (day) {
            case 1: return("Monday");
              ///  break; // Unreachable code, because return already exist the method
            case 2: return "Tuesday";

            case 3: return "Wednesday";

            case 4: return "Thursday";

            case 5: return "Friday";

            case 6: return "Saturday";

            case 7: return "Sunday";
            default:
                System.out.println("ERROR: Invalid day - " + day);
                return null; // null means no object or no value , not the same as String word = ""; this is empty string
                            //     break; if we put break instead return will compile error

        }

     //   return null;  or here works

    }

    public static String getDayNameV2(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                 break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day - "+ day);
                dayName = null;

        }
        return dayName;
    }

}
