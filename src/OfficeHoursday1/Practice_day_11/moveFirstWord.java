package OfficeHoursday1.Practice_day_11;

public class moveFirstWord {
    public static void main(String[] args) {

        String str = " java is a fun language";
        str= str.trim();
        int space = str.trim().indexOf(" ");
        String firstWord = str.substring(0, space);
        System.out.println(str.substring(space + 1) + " " + firstWord);


    }
}
