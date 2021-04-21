package day21_String_Manupulation2;

public class StringIndexOf {
    public static void main(String[] args) {
        /**            012345       */
        String word = "github";
        System.out.println(word.indexOf("g")); // 0
        System.out.println(word.indexOf("u")); // 4
        System.out.println(word.indexOf("hub")); // 3
        System.out.println(word.indexOf("java"));// -1 means it can not find if
        System.out.println(word.indexOf("t")); // 2




    }
}
