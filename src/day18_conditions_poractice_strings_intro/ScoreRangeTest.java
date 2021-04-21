package day18_conditions_poractice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {

        int score = 100;
        if (score >= 1 && score <=40) {
            System.out.println("Grade D");
        }else if (score >=41 && score <= 60) {
            System.out.println("Grade C");
        }else if (score >= 61 && score <=90 ) {
            System.out.println("Grade B");
        }else if (score >= 91 && score <=100) {
            System.out.println("Grade A");
        }else {
            System.out.println("Invalid score" + score);
        }


       // int score1 = 101; , this will not give us true result on both side
        //if (score1 <= 0 || score1 >100) {
        //    System.out.println("score1 = " + score1);




    }
}
