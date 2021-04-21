package day19_String_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());


        String firstName = "Zebib";
        System.out.println(firstName + " - " + firstName.length());

        int count = firstName.length();// store length to int variable
        System.out.println("count = " + count);



        String password = "abc123";
        // If statement
        // when password is at least 6 character

        if (password.length() >= 6) {
            System.out.println("Valid amazon password");

        }else {
            System.out.println("password must be at least 6 character");
        }

    }
}
