package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'a';

        if (grade == 'A' || grade == 'B' || grade == 'C' ) {
            System.out.println("Pass. with grade - " + grade);
        }else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade - "+ grade);
        }else if (grade == 'E') {
            System.out.println("Fail. Grade - " + grade);
        }else {
            System.out.println("Invalid Grade - " + grade);
        }

        // or we can use

        grade = 'D';

        if (grade == 'A' || grade == 'a' || grade == 'B' || grade =='b'| grade == 'C' || grade == 'c') {
            System.out.println("Pass. with grade - " + grade);
        }else if(grade == 'D' || grade == 'd') {
            System.out.println("Qualify for retake. Grade - "+ grade);
        }else if (grade == 'E' || grade == 'e') {
            System.out.println("Fail. Grade - " + grade);
        }else {
            System.out.println("Invalid Grade - " + grade);
        }

    }

}
