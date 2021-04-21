package ZebibPractices.Practice_day14.Practice_day31;
import javax.swing.*;
import java.util.*;

public class Practise_day31 {
    public static void main(String[] args) {
        // charArrays

//        char [] letter = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
//
//
//        for (char check : letter) {
//            System.out.print(check);
//
//        }
//        // convert char to string
//        String sentence = new String (letter);
//        System.out.println("\nsentence = " + sentence);
//
//        // convert string to char
//
//        String item = "wooden spoon";
//       char [] name= item.toCharArray();
//        System.out.println(Arrays.toString(name));
////
//        char [] words = {'A', 'B', 'C', 'D', 'E'};
//        String str = new String(words);
//        System.out.println(str);

//        String words [] = {"one", "two", "three"};
//        String str = String.join("!" , words);
//        System.out.println("str = " + str);

//        int nums [] = {5, 11, 9, 10};
//
//        Arrays.sort(nums);
//
//        System.out.println(Arrays.toString(nums));
//
//        System.out.println("min = " + nums [0]);
//        System.out.println("max = " + nums[nums.length-1]);

        String [] arr = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly", "gfjhgghk", "jhkjhkh"};

//        Arrays.sort(words);
//        System.out.println(Arrays.toString(words) + " ");
//        System.out.println("[" + String.join(", " ,words) + "]");
//
//        Arrays.sort(words, Collections.reverseOrder());
//        System.out.println(Arrays.toString(words));
        //char letter [];

       // for (int i =0; i <= words.length-1; i++) {
           // System.out.println(words[i].toCharArray());
//            letter = words[i].toCharArray();
//            System.out.println(letter.toString());
          //  for (String word : words) {

            //    System.out.println(""+ word [0] + "" + word.charAt(1)+word.charAt(word.length()));

        for (int i = 0; i < arr.length-1;i++) {
            System.out.println(arr[i].substring(0,3));

        }








    }
}
