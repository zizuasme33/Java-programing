package OfficeHoursday1.Practice_day_15;

public class Duplicate {
    public static void main(String[] args) {

        /*
        [IQ] Duplicate charactersGiven a String, find and print the duplicate characters.
         A character is duplicate if it appears more than once in the String.
         Ex:AAABCCDEEF
         Output:ACE
         */

//        String str = "AAABCCDEEF";
//        String checked = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            int count = 0; // coz we need to  reset it back to 0
//
//            if (checked.contains(" " + str.charAt(i))) {
//                continue;
//            }
//
//
//            for (int j = 0; j < str.length(); j++) {
//
//                if (str.charAt(i) == str.charAt(j)) { // A == A
//
//                    count++;
//
//                }
//
//            }
//
//            if (count > 1) {
//                System.out.println(str.charAt(i) + " is duplicate");
//            }
//            checked += str.charAt(i);
//
//
//
//        }
//

        String str = "AAABCCDEEF";
        String checked = "";

        for(int i=0; i < str.length(); i++) {
            int count = 0;

            if(checked.contains("" + str.charAt(i))) {
                continue;
            }

            for(int j= 0; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) { // A == C
                    count++;
                }

            }

            if(count > 1) {
                System.out.println(str.charAt(i) + " is duplicate");
            }

            checked += str.charAt(i);

        }





    }
}
