package ZebibPractices.Practice_day14.Replit.Methods;

public class countLetter {
    public static void main(String[] args) {
        String word = "aaabbcdd";
        // 3a2b1c2d

        // newWord :  abcd
        // original : aaabbcdd

        // output : 3a2b1c2d
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            if (!newWord.contains(""+word.charAt(i))) {
                newWord += word.charAt(i);
            }

        }
        System.out.println(newWord); //  newString = abcd;

        // abcd      outerloop
        // aaabbcdd  inner loop


        String output= "";
        int count = 0;
        for (int i = 0; i < newWord.length(); i++) { // outer loop

            count = 0;
            for (int j = 0; j < word.length(); j++) { // inner loop

                if (newWord.charAt(i) == word.charAt(j)){
                   count++;
                }

            }

            output += "" +count + newWord.charAt(i);

        }
        System.out.println( output);
    }
}
