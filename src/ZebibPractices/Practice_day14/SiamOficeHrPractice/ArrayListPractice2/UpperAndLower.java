package ZebibPractices.Practice_day14.SiamOficeHrPractice.ArrayListPractice2;

import java.util.ArrayList;

public class UpperAndLower {
    boolean isUpper;

    public ArrayList<String> isUpper(String str, boolean isUpper){
        ArrayList<String> strArr = new ArrayList<>();
        if (isUpper){
            for (int i = 0; i < str.length();i++) {
                if (str.charAt(i) <'Z' && str.charAt(i) > 'A'){
                    strArr.add("" + str.charAt(i));
                }

            }

        } else if (isUpper == false) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 'z' && str.charAt(i) > 'a') {
                    strArr.add("" + str.charAt(i));
                }
            }
        }
        return strArr;
    }

    public static void main(String[] args) {
        UpperAndLower word = new UpperAndLower();
        System.out.println(word.isUpper("AHjhhGBhkm", false));


    }

}
