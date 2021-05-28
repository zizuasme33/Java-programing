package ZebibPractices.Practice_day14.Replit.Methods;

public class countLetter2 {
    public static void main(String[] args) {
        String word = "aaabbcdd";
        System.out.println(countLetter(word));

    }

    public static String countLetter(String word){

        String output= "";
        int count = 0;
        int i = 0;
        while ( i < word.length()) { // outer loop

            // for (i = 0; i < word.length();  ) {

            count = 0;
            for (int j = 0; j < word.length(); j++) { // inner loop

                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }

            }

            output += "" +count + word.charAt(i);
            word =word.replace("" +word.charAt(i), "");

        }
        return output;
    }
}
