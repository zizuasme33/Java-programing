package OfficeHoursday1.Practice_day_22_Mon_May3;


import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {

        /*
            Hide PasswordGiven an array of passwords (String).
            Hide each password as a star (*) and show the hidden password
            Ex:
            Input:{"one", "hi", "hold}
            Output: [ ***, **, **** ]

         */

       String [] password = {"one", "apple", "hold"};

        ArrayList<String> hiddenPassword = new ArrayList<>();

        for (String each : password) {
            hiddenPassword.add(convertToStars(each));

        }
        System.out.println("Original: " + Arrays.toString(password));
        System.out.println("Hidden: " + hiddenPassword);

        // helper method : method that does some action, and its called somewhere else

    }

    public static String convertToStars(String str) {
        String stars = "";

        for (int i = 0; i < str.length(); i++) {
            stars += "*";
        }
        return stars;
    }
}
