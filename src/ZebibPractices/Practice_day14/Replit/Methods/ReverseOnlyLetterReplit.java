package ZebibPractices.Practice_day14.Replit.Methods;

import java.util.Scanner;

public class ReverseOnlyLetterReplit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // System.out.println(reverseNoSpec(in.next()));
        System.out.println(reverseNoSpec("Ab,c,de!$"));
        // e d c b A



    }

    public static String reverseNoSpec(String str) {

        char [] letters = str.toCharArray();


        for (int i = 0, j = letters.length-1; i <= letters.length/2; i++) {

            if (Character.isLetter(letters[i])){

                for (; j >= 0; j--) {

                if (Character.isLetter(letters[j])) {

                        char temp = letters[i];
                        letters[i] = letters[j];
                        letters[j--] = temp;
                        break;
                    }
                }

            }

        }

        return String.valueOf(letters);

    }
}
