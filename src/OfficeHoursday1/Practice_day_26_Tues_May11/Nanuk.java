package OfficeHoursday1.Practice_day_26_Tues_May11;

import java.util.*;

public class Nanuk {

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int foodFound = 0;

        for (String each : r){

            if (each.equals("nanuk")) {
                way_stones--;
            }else {
                foodFound += Integer.parseInt(each);
            }
        }

        return way_stones >= 0 && foodFound >= boast;

    }


}