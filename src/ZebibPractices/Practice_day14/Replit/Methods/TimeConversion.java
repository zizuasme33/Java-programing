package ZebibPractices.Practice_day14.Replit.Methods;

public class TimeConversion {
    /*
    Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
    Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

       The timeConversion method should convert and print the given number (String argument)
     */

    public static void main(String[] args) {
        millitaryTime("12:00:00PM");

    }

    public static void millitaryTime (String time) {
        String millitary = "";

        if (time.contains("Am") && time.startsWith("12")) {
            millitary = time.replace("Am", "");
            millitary = time.replaceFirst("12", "00");
            System.out.println(millitary);
            }else if (time.contains("AM") || time.contains("PM") && time.startsWith("12")) {
            millitary = time.substring(0, time.length() -2);
            System.out.println(millitary);
        } else if (time.contains("PM")){
            int millTime = Integer.parseInt(time.substring(0, 2)) + 12;
            System.out.println(millTime + time.substring(2, time.length()-2));

        }
//
//        }else if {
//            time = time.replace("PM", "");
//            if (time.startsWith("12")) {
//                millitary = time;
//            }else {
//                String [] timeArray = time.split(":"); // {09, 34, 44} after split
//                int hourInt = Integer.parseInt(timeArray[0]); // 9
//                  hourInt +=12;
//                timeArray [0] = Integer.toString(hourInt); // cast from int to integer
//               timeArray[0] = Integer.toString(Integer.parseInt(timeArray[0] + 12));
//                millitary = String.join(":", timeArray);
////               // 21:34:44
//
//
//            }
//            System.out.println(millitary);
//
//        }
//
//
//


//        if (time.contains("Am")) {
//            millitary = time.replace("Am", "");
//
////        } else if (time.startsWith("12")) {
//            millitary = time.replaceFirst("12", "00");
// // 09:00:12
//        }System.out.println(millitary);
//
//        // 12:00:00pm ===> 12:00:00
//        // 09:34:44 ====> 21:34:44
//    }
//        }else { // is just allow you to execute PM
//          time = time.replace("PM", ""); // 12:00:00
//           if (time.startsWith("12")) { // it is PM and it start with 12
//               millitary = time; // 12:00:00
//           }else { // means  it is Pm but, it doesnt start with 12
//               // 09:34:44PM ===> 21:34:44
//               String hour = time.substring(0, time.indexOf(":")); // ===> first way // 09
//               String [] timeArray = time.split(":"); // {09, 34, 44} after split
//               int hourInt = Integer.parseInt(timeArray[0]); // 9
//               hourInt +=12;
//               timeArray [0] = Integer.toString(hourInt); // cast from int to integer
//               timeArray[0] = Integer.toString(Integer.parseInt(timeArray[0] + 12));
//               // {21, 34, 44} // 213444
//               millitary = String.join(":", timeArray);
//               // 21:34:44
//               System.out.println(millitary);
//           }
//
//        }
    }
}
