package OfficeHoursday1.Practice_day_13;

public class CountUpperLowerNumber {
    public static void main(String[] args) {

        /**
         * Count upper, lower, and numbers
         * Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
         * Ex:
         * Input: 2juMp41EEkd4s4 Output:
         * 3 uppercase letters
         * 6 lowercase letters
         * 5 numbers
         */

        String str = "2juMp41EEkd4s4";
        int upperCase = 0, lowerCase =0, number = 0;
        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i); // 2 --> ascii : 50
            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCase++;
            }else if(eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCase++;
            }else if (eachLetter >= '0' && eachLetter <='9') { // char car 48 - 57
                number++;

            }

        }
        System.out.println("UpperCase = " + upperCase);
        System.out.println("LowerCase = " + lowerCase);
        System.out.println("Number = " + number);

    }

}
