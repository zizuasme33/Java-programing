package day21_String_Manupulation2;

public class FirstAndLastTest {
    public static void main(String[] args) {

        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last) {
            System.out.println("first and last letter match");
        }else {
            System.out.println("first and last method mismatch");
        }

         if (word.charAt(0)== word.charAt(2)) {
             System.out.println("first and last letter match");
         }else
        System.out.println("first and last method mismatch");

         String friend = "level";
         char firstLetter = friend.charAt(0);
         int count = friend.length();
         // count--;
         char lastLetter = friend.charAt(count-1);
        // char lastLetter = friend.charAt(friend.length()-1);

        if (firstLetter == lastLetter) {
            System.out.println(friend + " - first and last match");
        }else {
            System.out.println(friend + "- first and last mismatch");
        }

        System.out.println(firstLetter);
        System.out.println(lastLetter);

        String word1 = "alo";
        String word2 = "okk";


        char firsLetter  = word1.charAt(0);
        char secondLetter = word2.charAt(word2.length()-1);
        if (firsLetter == secondLetter) {
            System.out.println(firsLetter + "" + secondLetter);
        }else {
            System.out.println("cannot merge");


        }
    }

}
