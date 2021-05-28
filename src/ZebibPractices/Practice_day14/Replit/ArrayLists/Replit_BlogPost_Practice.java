package ZebibPractices.Practice_day14.Replit.ArrayLists;

import java.util.*;

public class Replit_BlogPost_Practice {
    public static void main(String[] args) {


    }

    public static String blogDb(ArrayList<String[]> r, String id) {


        String result = "";

        for (String [] each : r){
            if(each[0].equals(id)){
                result =each[1] +"\n" + each[2];
            }

        }

        return result;



    }
}
