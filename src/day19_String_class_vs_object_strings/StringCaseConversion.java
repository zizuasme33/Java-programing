package day19_String_class_vs_object_strings;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTeck";
        String sentence = "123 Java IS Fun!";
        System.out.println(word);

        // convert word to lower case and uppercase
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());
        System.out.println("================================");


        word.toLowerCase(); //
        System.out.println(word); // this still will take out the same

        String wordInLcase = word.toLowerCase(); // assign to ne variable to lower the case
        System.out.println("wordInLcase = " + wordInLcase);
        // change word to all lower case, and assign back
        System.out.println("================================");

        word = word.toLowerCase(); // take a word and assign back to word
        System.out.println("word = " + word);

        
        // upper case 
        System.out.println("================================");
        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase()); // JAVA
        System.out.println("================================");
        
        // change company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
        




    }

}
