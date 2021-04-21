package ZebibPractices.Practice_day14.Practice_day19;

import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
//        String word = "Java";
//        System.out.println(word.equalsIgnoreCase("Java"));
//
//        if (word.equalsIgnoreCase("java")) {
//            System.out.println("word = " + word);
//        }
//
//       String expUserName = "cybertek";
//        String expPassword = "ABC123";
//
//        String userNAme = "cyberTek";
//        String password = "ABC123";
//        if (expUserName.equalsIgnoreCase(userNAme) && expPassword.equals(password)) {
//            System.out.println("pass");
//        }else {
//            System.out.println("fail");

            String word = "java";
        System.out.println(word.length());

        String country = "AS";
        if (country.endsWith("AS")) {
            System.out.println("Pass");
        }else {
            System.out.println("fail");
        }


        String email = "zizu_Ss@yahoo.com";
        if (email.toUpperCase().contains("S")) {
            System.out.println(":got it");
        }



    }
}
