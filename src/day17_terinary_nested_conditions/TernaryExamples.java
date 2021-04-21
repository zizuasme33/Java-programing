package day17_terinary_nested_conditions;

public class TernaryExamples {

    public static void main(String[] args) {
        
         int score1 = 45;
        String result1;
        if (score1 > 60) {
            result1= "pass";
        } else {
            result1 = "fail";
        }
        System.out.println("result1 = " + result1);
        
        // Ternary

        int score = 90;
        String result  = (score>60 ) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality = "bad";
        int rating = (quality.equals("good")) ? 100: 0;
        System.out.println("rating = " + rating);
        System.out.println((quality.equals("good")) ? 100: 0);


        int score3 = 100;
        char grade = (score3 > 90) ? 'A': 'B';
        System.out.println("grade = " + grade);


        String evenOdd = (score % 2 ==0) ? "even" : "odd";
        System.out.println("evenOdd = " + evenOdd);



    }

}
