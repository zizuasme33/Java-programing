package ZebibPractices.Practice_day14.Practice_day27;

public class ForloopContinue {
    public static void main(String[] args) {
//
//        String word = "jaaavvaa";
//
//        for (int index = 0; index < word.length()-1; index++) {
//            System.out.print(word.charAt(index));
//            System.out.println(word.charAt(index + 1));
//
//            if (word.charAt(index) == word.charAt(index+1)) {
//                System.out.println("beep " + word.charAt(index));
//            }
//
//        }
        String word = "github";
        char letter = 't';
        int index = -1;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                index =i;
                System.out.println(letter + " is found in " + index);
            }

        }





    }
}
