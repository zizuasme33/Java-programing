package ZebibPractices.Practice_day14.SiamOficeHrPractice;

public class countLetter {
    public static void main(String[] args) {
        String str = "java";
        char letter = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
               count++;
            }
        }
        System.out.println(letter + " is found " + count +" times in  "+ str);

        // count upper letter, small letter, number

        String word = "2jUMp41EEkd4S4";
        int upperLetter = 0;
        int lowerLetter = 0;
        int num = 0;
        for (int i = 0; i < word.length(); i++) {

            char lett = word.charAt(i);
            if (lett >= 'A' && lett <= 'Z'){
                upperLetter++;
            } else if (lett >= 'a' && lett <= 'z') {
                lowerLetter++;
            }else if (lett >= '0' && lett <= '9'){
                num++;
            }

        }
        System.out.println("upperLetter = " + upperLetter);
        System.out.println("lowerLetter = " + lowerLetter);
        System.out.println("num = " + num);


    }

}
