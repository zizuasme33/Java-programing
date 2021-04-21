package day19_String_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {

        String countryCode = "KG";

        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("pass - case is correct");
        }else {
            System.out.println("Fail - case incorrect");
        }



        //String x = countryCode.equals(countryCode.toUpperCase()) ? "equals" : "not equels";
        //        System.out.println(x);
    }
}
