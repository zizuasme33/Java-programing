package OfficeHoursday1.Siam_handed_Practice.Loop3;

public class UniqueCharacter {
    public static void main(String[] args) {

        /**Given a String, find and print the unique characters.
         *  A character is unique if it only appears once in the String.
         *  Ex:AAABCCDEEF
         *  Output:BDF

         */

        String  word = "AAABCCDEEF";
        String firstChar = "";
        String secondChar = "";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            firstChar = word.charAt(i) + "";

            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                secondChar = word.charAt(i) + "";

                if (!firstChar.equals(secondChar)) {
                    count++;

                }
                if (count == 1) {
                    unique  += word.charAt(i);


            }
                System.out.print(unique);

            }


        }



    }
}
