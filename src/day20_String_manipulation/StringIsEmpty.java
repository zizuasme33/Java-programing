package day20_String_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty()); // true
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);

        if (jobTitle.isEmpty()) {
            System.out.println("Job title is missing, can you please resend");
        }else  {
            System.out.println("Job title looks good");
        }
        if (jobTitle.length()==0) {
            System.out.println("Job title is empty");

        }else {
            System.out.println("Job title is not empty");
        }

        System.out.println(jobTitle.equals(" "));

        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        }else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty()); // false
        System.out.println(word.length()); // 1

        String veggie = "carrots";
        System.out.println(veggie.isEmpty()); // false
        // if veggie IS NOt EMPTY, print we have carrots

        if (!veggie.isEmpty()) {
            System.out.println("print we have " + veggie);
        }

        String word2;
        //System.out.println(word2.isEmpty()); will be ERROR. Not initialized

    }
}
