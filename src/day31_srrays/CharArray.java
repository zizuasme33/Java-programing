package day31_srrays;

import javax.lang.model.SourceVersion;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ' ,'f', 'u', 'n'};
        
        // print each letter using a loop
        
        for (char each : letters) {

            System.out.print(each + " ");
        }

        String sentence = new String (letters); // converting char array to String == called constructor

        System.out.println("\nsentence  = " + sentence);

        // converts String to char Array
        // char [] itemArray = item.toCharArray();

        String  item = "wooden spoon";
        char [] itemArray = item.toCharArray();

        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
      //  System.out.println(Arrays.toString(itemArray)); to print in arrays format


        String [] fruits = {"banana", "apples", "kiwi", "mango", "papaya", "strawberry" };
                            //   0              1       2       3       4           5

        // "banana - apples - kiwi- mango- papaya- strawberry
        
        String fruitStr = "";

        for (String each : fruits) {
            fruitStr += each + "-";
            System.out.print(each + "-");
        }

        System.out.println("\nfruitStr = " + fruitStr);

            // or System.out.println(fruits [0] + "-" + fruits [1] + "-"+ fruits [2] + "-"+ fruits [3] + "-"+ fruits [4] + "-"+ fruits [5]);

            String [] languages = {"java", "python", "c++", "sql" , "ruby", "javaScript"};

        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));
        String jointLanguages = String.join(" <> ", languages);
        System.out.println("jointLanguages = " + jointLanguages);



      


    }
}
