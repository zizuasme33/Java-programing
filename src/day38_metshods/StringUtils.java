package day38_metshods;

import sun.font.FontRunIterator;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.isEmpty());
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word)); // word or null
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

    }




    public static boolean isNullOrEmpty(String str) {

        return (str == null || str.isEmpty());


//        if(str == null || str.isEmpty()){
//            // if we put ( str.isEmpty() || str == null ) first will give us NUllPointerException
//          return true;
//        }
//        return false;
    }


    // INTERVIEW QUESTIONS
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()- 1 - i)) {
                return false;

            }

        }

        return true;
    }

    public static String reverse(String str) {
        String revWords = "";
        for (int i = str.length()-1; i >= 0; i--) {
            revWords += str.charAt(i);

        }
        return  revWords;
    }

}








    /**
     * Student notes
          - if (str.isEmpty || word == null ){ → this will give NullPointerException
         - if(word == null || word.isEmpty()) { → this will be true, NO ERROR
          - if(word == null | word.isEmpty()) { → this will give NullPointerException because you are using one pipe which forces the program to check both sides
     */
//}
