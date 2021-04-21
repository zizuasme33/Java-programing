package ZebibPractices.Practice_day14.Practice_day22;

public class string_manipulation3 {
    public static void main(String[] args) {
        // 1st example reverse using char

        String word = "noon";
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0)); // noon
        String reverse = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0); // noon
        System.out.println("reverse = " + reverse);

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        // 2nd practice indexOf
        String technology = "java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technology.indexOf(",")); // 4
        System.out.println(technology.lastIndexOf(",")); // 5
        System.out.println(technology.indexOf("java")); // 0
        System.out.println(technology.indexOf("cucumber")); // 42
        int sqlIndexOf = technology.indexOf("sql"); // -1
        System.out.println("sqlIndexOf= " + sqlIndexOf); // -1

        if (technology.contains("html")) {
            System.out.println("html is present");
        } else {
            System.out.println("html is not present");
        }


        // 3rd practice

        String word1 = "hello";
        word1.indexOf("el");// 1
        word1.indexOf("lo");// 3
        System.out.println(word1.indexOf("lo"));

        if (word1.indexOf("ell") > -1) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }

        // 4th Practice substring

        String word3 = "hello";
        System.out.println(word3.substring(2, 4)); // ll
        System.out.println(word3.substring(0, 4)); // hell
        System.out.println(word3.substring(0));
        System.out.println(word3.substring(2));//llo
        System.out.println(word3.substring(3));

        // 5th Practice

        String result = "result count:12345";
        //  find indexOf
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex + 1));

        String today = "I learn lot of [java code]  today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start + 1, end));
        System.out.println(today.substring(today.indexOf("[") + 1, today.indexOf("]")));


    }
}
