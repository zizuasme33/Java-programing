package OfficeHoursday1.Practice_day_30_Tues_May25;

import day41_arraylist.ArrayAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveDuplicate {
    /*
        This method will take an ArrayList of numbers and remove any duplicates values.
        The method will return an ArrayList of unique elements.
        @param nums-The given ArrayList of numbers@return -ArrayList of numbers
        Ex: Input: {1, 3, 5, 1, 4, 5, 9};Output: {3, 4, 9};
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9, 2, 9, 9, 9, 8));

        System.out.println(removeAll(list));
        System.out.println(removeDUp2(list));
        System.out.println(removeDUp3(list));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(removeBad(list2));
    }

    public static ArrayList<Integer> removeAll(ArrayList<Integer> list) {
        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) == list.get(j)) {
                    count++;
                }

            }

            if (count == 1) {
                uniques.add(list.get(i));
            }

        }

        return uniques;
    }

    public static ArrayList<Integer> removeDUp2(ArrayList<Integer> list) {

        list.removeIf(e -> Collections.frequency(list, e) > 1);

        return list;
    }



    /*

            Another Third way to solve it
            public static ArrayList<Integer> removeDup(ArrayList<Integer> list){

        ArrayList<Integer> uniques = new ArrayList<>();
        String checked = "";

        for(int i=0; i < list.size(); i++) {
            int count = 0;

            if(!checked.contains("" + list.get(i))) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }

                if (count == 1) {
                    uniques.add(list.get(i));
                }

                checked += list.get(i) + " ";

            }

        }

        return uniques;
    }


     */

    public static ArrayList<Integer> removeDUp3(ArrayList<Integer> list) {
        // STUDENT APPROACH

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (!result.contains(each)) {
                result.add(each);
            }
        }
        return result;

    }

    public static ArrayList<Integer> removeBad(ArrayList<Integer> list) {
        // STUDENT APPROACH

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <= list.size()-3; i++) {
           result.add(list.remove(i+1));
        }

        return result;
        }



}