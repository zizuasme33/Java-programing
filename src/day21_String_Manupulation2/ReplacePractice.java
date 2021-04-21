package day21_String_Manupulation2;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {

        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub" ,"lab"));
        System.out.println("word = " + word); // word is still the same github
        word = word.replace("hub", "lab");
        System.out.println("word = " + word); // now word change to gitlab

        System.out.println(word.replace('i', 'o').replace('a', 'i')); // chaining it and connecting it

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);
        
        //"java" --> selenium, "fun" ---> "a lot of fun" --> assign back withNoSpance
        
        withNoSpace= sentence.replace("java" , "selenium").replace("fun", "a lot of fun");
                              // .replace("fun", "a lot of fun");
        // withNoSpace= sentence.replace("fun", "a lot of fun").or we can do this
        System.out.println("withNoSpace = " + withNoSpace);

        String result = "1-48 of over 4,000 results for java book";
        result= result.replace("1-48 of over ","")
                        .replace(",","")
                        .replace(" results for java book","");
        System.out.println("result = " + result);

                       





    }
}
