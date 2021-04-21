package day12_conditional_tatements;

public class CompareChars {
    public static void main(String[] args) {
       char letter1 = 'A'; // letter2 = 'J'
        char letter2 = 'J';
       // boolean compare = letter1 > letter2;
        System.out.println(letter1 == letter1); // 65 ==74
        System.out.println(letter1 > letter1);// 65 > 74
        System.out.println(letter2 > letter1);// 74 > 65

        char grade = 'A';
        boolean pass = grade <= 'D' ;
        System.out.println("Did you pass the exam? - " + pass); // true



    }
}
