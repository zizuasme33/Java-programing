package ZebibPractices.Practice_day14.Replit.ArrayLists;

import java.util.*;

public class ReplitSumPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,4,3));
        System.out.println(appendPosSum(list));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        ArrayList<Integer> sums = new ArrayList<>() ;
        int positive = 0;

        for(int each : list){
            if (each >=0){
                sums.add(each);
                positive += each;



            }

        }
        sums.add(positive);


     return sums;
    }

}
