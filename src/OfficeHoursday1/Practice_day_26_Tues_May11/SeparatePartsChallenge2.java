package OfficeHoursday1.Practice_day_26_Tues_May11;

import java.util.*;

public class SeparatePartsChallenge2 {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> all = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            all.add(str.charAt(i));
        }

        ArrayList<Character> letters  = new ArrayList<>(all);
        ArrayList<Character> digits = new ArrayList<>(all);
        ArrayList<Character> special  = new ArrayList<>(all);

        letters.removeIf(eachChar -> ! Character.isLetter(eachChar)); //if this element has letter will remove it
        digits.removeIf(eachChar -> !Character.isDigit(eachChar));
        special.removeIf(eachChar -> Character.isDigit(eachChar) || Character.isLetter(eachChar));
       //or for special ---> Character.isLetterOrDigit()
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);

        
        


    }
}
