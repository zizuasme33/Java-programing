package day42_arraylist;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class MethodsWithList {
    /**
        Method Name : PrintStrList
        param : List of String
        return void
        prints all values separated by space in same line
     */

    public static void main(String[] args) {

        // declare string arraylist and values
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html");
        words.add("selenium"); words.add("a"); words.add("input");
        words.add("title");

        // pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));


        // Some Integer List
        List<Integer> nums =  Arrays.asList(23, 54, 23, 54554, 234, 11, 5, 2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);



    }

    public static void printStrList(List<String> stringList){ // "java",

        for (String each : stringList) {
            System.out.print(each + " ");
        }

        System.out.println();

    }



    /**
        methods: sumIntegerList
        param: List of Integer
        returns int
        calculate sum of integers in the list
     */
    

   static public int sumIntegerList (List<Integer> list) {
        int sum = 0;
        for (Integer each : list) {
            sum += each;

        }

        return sum;

    }

}





