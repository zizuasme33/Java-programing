package OfficeHoursday1.Practice_day_05_March15_2021;

public class GradeRetake {
    public static void main(String[] args) {

        int basGrade = 90;
        int numberOfAttempt = 1;
        int retakePenalty = 0;

        if (numberOfAttempt == 1) {
            retakePenalty = (int) (basGrade * 0.10);

        }else if (numberOfAttempt == 2) {
                retakePenalty = (int) (basGrade * 0.20);
        }else if (numberOfAttempt == 3) {
            retakePenalty = (int) (basGrade * 0.35);
        } else {
            System.out.println("Invalid attempt Number");
        }


        System.out.println("Grade after retake attempt " + numberOfAttempt + " was: " + (basGrade -retakePenalty));
    }
}
