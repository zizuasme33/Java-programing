package ZebibPractices.Practice_day14.Practice_day19;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringClass_Practice {
    public static void main(String[] args) {
        String word = "JAVA";
        System.out.println(word.equalsIgnoreCase("java"));
        System.out.println(word.equalsIgnoreCase("JAVA"));
        System.out.println(word.equalsIgnoreCase("JAVA"));

        // 2nd Practice

        String expuserName = "CybeRtek";
        String expassword = "a1234";

        String username = "cybertek";
        String password = "a1234";
         if (expuserName.toLowerCase().equals(username) && expassword.toLowerCase().equals(password)) {
            System.out.println("pass");
         }else {
             System.out.println("fail");

        }




    }
}
