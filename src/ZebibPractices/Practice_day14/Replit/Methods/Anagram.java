package ZebibPractices.Practice_day14.Replit.Methods;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";
    //    word1 = word1.replace(" ", "").toLowerCase();
     //   word2 = word2.replace(" ", "").toLowerCase();
        boolean output = false;
//
//        for (int i = 0; i < word2.length(); i++) {
//
//            if(word1.length() != word2.length()) {
//                output = false;
//                break;
//
//            }
//
//            if(word1.contains(""+word2.charAt(i))) {
//                    output = false;
//                }
//
//
//            }
//
//
//
//        System.out.println( output);


  //      word1 = word1.replace(" ", "").toLowerCase();
   //     word2 = word2.replace(" ", "").toLowerCase();

        if (word1.length() == word2.length()){
            output = true;

        }

        char [] newWord = word1.toCharArray();
        char [] newWord2 = word2.toCharArray();

        Arrays.sort(newWord);
        Arrays.sort(newWord2);

        if (newWord == newWord2){
            output = true;
        }

        System.out.println("output = " + output);



    }
}
