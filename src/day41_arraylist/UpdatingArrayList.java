package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // cars list

        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        // jeep , lada, yugo, toyota, mazda, ford, maskvich, tesla

        System.out.println(myCars.toString()); // prints all cars
        String allCarsIn1St = myCars.toString();// saves all cars in 1 string variable

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        // change index 0 to Lamborghini( it replace to )
        myCars.set(0, "lamborghini");
        System.out.println("after set = " + myCars.toString());

        //change 4 to Honda
        myCars.set(4, "honda");
        System.out.println("After set honda = " + myCars.toString());

        /**
           How would you do that if myCars was array:
           myCars(4) == "Honda";
         */


        // find the index number if "ford"
        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moskvichIindex = myCars.indexOf("moskvich"); // to store it
        System.out.println("moskvichIndex = " + moskvichIindex);

        //change moskvich to jiguli
        myCars.set(moskvichIindex, "jiguli");

        System.out.println("after set to jiguli = " + myCars);

        // replace ford with trabant using single statement

        // indexOf("ford")
        myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set of trabant = " + myCars);

        // lada -> bugatti
        /*
        preventing the error
        if my cars contains "lada"
        find my index of lada and set value to bugatti
         */
        if (myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
           // System.out.println(myCars);
        }else {
            System.out.println("lada is not found");
        }

        System.out.println("after set bugatti = " + myCars.toString());

        /*
            lamborghini - > prius
            lada -> lexus
            trabant -> audi
         */

        for (int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("lamborghini")){
                myCars.set(i, "pruis");
            }else if (myCars.get(i).equals("toyota")){
                myCars.set(i, "lexus");
            }else if (myCars.get(i).equals("trabant")){
                myCars.set(i, "audi");

            }

        }
        System.out.println("after loop = " + myCars);




    }
}
