package day22_String_manipulation3;

//import java.lang.*; // added by default/automatically

public class ReverseUsingChartAt {
    public static void main(String[] args) {
        String word = "java";

       // System.out.println(word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) +
            //    "" + word.charAt(0));
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        // print using single statement and concat +

        System.out.println("" + word.charAt(3) +  word.charAt(2) +  word.charAt(1) + word.charAt(0));

        String reverse = "" + word.charAt(3) +  word.charAt(2) +  word.charAt(1) + word.charAt(0);

        System.out.println("word = " + word);
        System.out.println("reverse = " + reverse);

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome word");
        }else {
            System.out.println("Not palindrome");
        }





    }
}
