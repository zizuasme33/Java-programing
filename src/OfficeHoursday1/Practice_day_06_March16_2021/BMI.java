package OfficeHoursday1.Practice_day_06_March16_2021;

public class BMI {
    public static void main(String[] args) {

        double mass = 62.4;
        double height =1.65;
        double BMI = mass / (height * height);

        if (BMI > 18.5) {
            System.out.println("Under weight");

        } else if (BMI >= 18.25 && BMI > 25) {
            System.out.println("Normal weight");

        }else if (BMI >= 25 && BMI >30) {
            System.out.println("Over Weight");
        }else {
            System.out.println("Obese");
        }

    }
}
