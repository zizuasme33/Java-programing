package day22_String_manipulation3;

public class StringSubstring {
    public static void main(String[] args) {

        String word = "java is fun";
        /**
         * 1) word.substring (startIndex, endIndex
         */
        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(5, 7));
        // print fun
        System.out.println(word.substring(8, 11));


        /**
         * 2) substring (StartIndex) - it will read from start until end
         */

        // print fun
        System.out.println(word.substring(8));
        // print is fun
        System.out.println(word.substring(5));

    }
}
