package day28_Loops;

public class FindUniqueChars {
    public static void main(String[] args) {

        /**
         * Given a string retrieve and print only unique characters
         */
        String word = "howdyho";
        String unique = "";

         for (int i = 0; i < word.length(); i++) {
             if (!unique.contains(word.charAt(i) + "")) {
                 unique += word.charAt(i);
                 // System.out.println(word.charAt(i));

             }

         }
        System.out.println("unique = " + unique);





    }
}
