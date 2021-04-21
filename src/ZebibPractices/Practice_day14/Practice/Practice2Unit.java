package ZebibPractices.Practice_day14.Practice;

import java.util.Locale;

public class Practice2Unit {
    public static void main(String[] args) throws InterruptedException {

//        String word = "java ";
//        System.out.println(word.equalsIgnoreCase("JAva")); // true
//
//        if (word.equalsIgnoreCase("JaVA")) {
//            System.out.println("word = " + word);
//
//        }

//        // Login test
//        String expUserName = "cybertek";
//        String expPassword = "ABC1234";
//
//        String userNAme = "CYBERTEK";
//        String password = "abc1234";

//        if(expPassword.equals(password)) {
//            System.out.println("Valid password");
//        }
//
//        if (expUserName.equals(userNAme)) {
//            System.out.println("Valid username");
//        }else {
//            System.out.println("invalid username");
//        }

//        System.out.println(userNAme.toLowerCase());
//        System.out.println(expUserName.toUpperCase());
        // 1 2 3 4
//       String word = "java";
//        System.out.println(word.length());

        // String country = "USA";
//        if (country.equalsIgnoreCase("usa")) {
//            System.out.println("pass");
//        }
//
//
//        if (country.toLowerCase().endsWith("a")) {
//            System.out.println("U is  available");
//        }else {
//            System.out.println("its not available ");
        // }

//        String words = "selenium";
//        System.out.println(words.endsWith("elenium"));

//        String email = "MURODIL@cybertekschool.com";
//        if(email.toLowerCase().contains("r")) {
//            System.out.println("Valid");
//        }
//
//        String words = "java";
//        System.out.println(words.replace("a", "b"));

//        String result = "1-48 of over 4,000 results for java book";
//        result = result.replace("1-48 of over ", "")
//                        .replace(" results for java book", "")
//                        .replace(",", "");
//        System.out.println("result = " + result);
        //     0123
//        String word = "java";
//        System.out.println(word.charAt(2));// a
        // Palindrome

//        String word = "level";
//        char firstChar = word.charAt(0);
//       char lastChar = word.charAt(word.length()-1);
//
//        if (firstChar == lastChar) {
//            System.out.println("Palindrome");
//
//        }else {
//            System.out.println("not palindrome ");
//        }

//        String word = "java";
//        System.out.println(word.charAt(3) +" " + word.charAt(2) + " " + word.charAt(1) +
//                " " + word.charAt(0));

//        String technologies = "java, html, css, selenium, testng, maven, cucumber";
//        System.out.println(technologies.indexOf("java"));
//
//        if (technologies.indexOf("html") < 1) {
//            System.out.println("present");
//        }else {
//            System.out.println("not present");
//        }
//
//        String word = "hello";
//        System.out.println(word.indexOf("el")); // 1
//        System.out.println(word.indexOf("llo"));// 2
//
//        if (word.indexOf("el") >= -1 || word.indexOf("el") != -1) {
//            System.out.println("Present");
//        }
//

//        String message = "Sender: [Nadir] From Number<1222-333-4444> Message:{Hello, lets code some java}";
//            int start = message.indexOf("[");
//            int end = message.indexOf("]");
//        String sender = message.substring(start+1, end);
//            int first = message.indexOf("<");
//            int last= message.indexOf(">");
//        String mobile = message.substring(first+1, last);
//            int firstCurlly = message.indexOf("{");
//            int lastCurrly = message.indexOf("}");
//            String text = message.substring(firstCurlly+1, lastCurrly);
//
//        System.out.println(sender);
//        System.out.println(mobile);
//        System.out.println(text);
//
//        String word = "hello world";
//        System.out.println(word.toLowerCase().replace(" ", "|"));

        // while loops
//        int apples = 1;
//        while (apples <= 10) {
//            System.out.println("apples = " + apples);
//            apples++;
//        }
//        int seconds = 0;
//        while (seconds <= 117) {
//            System.out.println("seconds = " + seconds);
//            seconds++;
//          //  Thread.sleep(1000);
//        }

//        int count = 5;
//        while (count >= 0) {
//            System.out.println("count = " + count);
//            count--;

        //}

//        int dollar = 5;
//        while (dollar != 5) {
//                dollar++;
//                System.out.println("dollar = " + dollar);
//            }


//        char letters = 'a';
//        char alphabetic = 'z';
//        while (letters < 'z') {
//            letters ++;
//            System.out.print( letters + " ");
//        }

//        int secretPinCode = 1234;
//        int enterPinCode;
//
//        do {
//            System.out.println("Enter the pin code");
//            enterPinCode = 123;
//
//        }while (secretPinCode != enterPinCode);
//        System.out.println("Welcome to your account");

        boolean isHungry = true;
        int banana = 0;
        int countToFull = 3;

        while (isHungry) {
            banana++;
            if (banana == countToFull) {
                 isHungry = false;
                System.out.println("has enough banana");
           }
       }



    }

}

