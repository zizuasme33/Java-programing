package OfficeHoursday1.Practice_day_28_Tus_May18;


import java.util.Arrays;

public class Mutability {
    public static void main(String[] args) {

        String one = "java"; // pointing the same object
        String two = one;
        String three = two.toUpperCase();
        System.out.println(three);

        System.out.println(two.toUpperCase() == three);

        one = one.substring(2);
        System.out.println(one);
        System.out.println(two);

        String a = new String("anything");
        String b = a;
        
        b = b.toUpperCase();
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int [] arr = {1,2,3};
        int [] arr2 = arr;
        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
