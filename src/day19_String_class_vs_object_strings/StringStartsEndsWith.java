package day19_String_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        String word = "intellij idea";
        System.out.println(word.startsWith("i")); // true
        System.out.println(word.startsWith("in")); // true
        System.out.println(word.startsWith("intellij")); // true
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j")); // true
        System.out.println(word.startsWith("Int")); // false. case sensitive

        // end with
        System.out.println(word.endsWith("idea")); // true
        System.out.println(word.endsWith("a")); // true

        String firstname = "Dr.Nadir.";
        if (firstname.startsWith("Mr.")) {
            System.out.println("Man");
        }else if (firstname.startsWith("Dr.")) {
            System.out.println("Doctor");
        }else if (firstname.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstname.startsWith("Ms.")) {
            System.out.println("Single Woman");
        }else if (firstname.startsWith("Sr.")) {
            System.out.println("Senior");
        }else {
            System.out.println("Normal name");
        }

//         String url = "http://www.stackoverflow.com
//        .com - "commercial website"
//         .ru- "Russain website"
//        .gov - "Government
//         .edu- "Education website"
//        .org - "organization website.

        String url = "http://charitywater.org";
        if (url.endsWith(".com")) {
            System.out.println("Commercial website");

        }else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        }else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        }else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        }else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }
    }
}
