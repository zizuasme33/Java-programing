package ZebibPractices.Practice_day14.Practice_day37;

public class PracticeDaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(4));


        for (int i = 1; i < 8 ; i++) {
            System.out.println(getDayName(i));
        }
            String today = getDayName(6);
            System.out.println("today = " + today);
            String someDays = getDayName(0);
            if (someDays == null) {
                System.out.println("No such a day");
            }

    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3: dayName = "Wednesday";
            break;
            case 4: dayName = "Thursday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            case 7: dayName = "Sunday";
            break;
            default:
                System.out.println("invalid days =  " + day);
            return null;
        }
      return dayName;
    }

}
