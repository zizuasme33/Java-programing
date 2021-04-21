package ZebibPractices.Practice_day14.Practice_day26;
import  java.util.*;
public class practice {
    public static void main(String[] args) {


        String word = "fifteen";

       // System.out.println(word.length() % 2==1);

        if (word.length()% 2 ==1) {
            System.out.println(word.substring(2,5));
        } else {
            System.out.println("invalid");

        }


    }
}
