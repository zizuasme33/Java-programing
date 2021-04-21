package day30_arrays;

import java.util.Arrays;
import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {

        String [] students1 = new String [5];

        students1 [0] = "Ad1234";
        students1 [1] = "Zebib";
        students1 [2] = "Tewelde";     //this is good when you assign an new value array
        students1 [3] = "B22";
        students1 [4] = "571-277-9116";


        String [] students2 = {"Mk 24133", "Mike", "Smith", "B22" , "571-277-9116" };
        System.out.println("Student1 Id = "  + students1[0]);
        System.out.println("Student1 firstName = " + students1[1]);
        System.out.println("Student1 lastName = " + students1 [2]);
        System.out.println("Student1 batch num = " + students1 [3]);
        System.out.println("Student mobile num = " + students1 [4]);

        System.out.println("Student data length: " + students1.length); // count of size or item or length

        /**
         *
         */

        if (students1.length == 5) {
            System.out.println("PASS: data arrays has correct length");
        }else {
            System.out.println("FAIL: data arrays has incorrect length");
        }

        /**
         check if students1 and students2 arrays have same number of data
         */

        if (students1.length == students2.length) { // we dont need to put bracket in .length
            System.out.println("PASS: data arrays length match");
        }else {
            System.out.println("FAIL: data arrays length match");
        }

        /**
         *Print first name and last name in all uppercase
         */
                        //     Zebib ---> ZEBIB                   Tewelde ----> TEWELDE
        System.out.println(students1[1].toUpperCase() + " " + students1[2].toUpperCase());

        /** read mobile from array and store into variables
         */
        
        String mobilNumber = students1[4];  // store phone number into variables
        System.out.println(mobilNumber.length());
        System.out.println("mobilNumber = " + mobilNumber);
        System.out.println(mobilNumber.startsWith("571"));


    }
}
