package OfficeHoursday1.Practice_day_7_March17_2021;

public class AgeGroup {
    public static void main(String[] args) {


        int age = 10;

        if (age > 0 && age < 120) {    // (age > 120 || age < 0)
            // valid age

            if (age <= 2) {
                System.out.println("Infant");
            } else if (age >= 3 && age <= 5) {
                System.out.println("Toddler");
            } else if (age >= 6 && age <= 9) {
                System.out.println("Kid");
            } else if (age >= 10 && age <= 12) {
                System.out.println("Pre teen");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenage");
            } else if (age >= 18 && age <= 20) {
                System.out.println("Young Adult");
            } else if (age >= 21 && age <= 39) {
                System.out.println("Adult");
            } else if (age >= 40 && age <= 49) {
                System.out.println("Young Middle-Aged Adult");
            } else if (age >= 50 && age <= 54) {
                System.out.println("Middle-Aged Adult ");
            } else if (age >= 55 && age <= 64) {
                System.out.println("Very Young Senior Citizen");
            } else if (age >= 65 && age <= 74) {
                System.out.println("Young Senior Citizen");
            } else if (age >= 75 && age <= 84) {
                System.out.println("Senior Citizen ");
            } else if (age >= 85 && age <= 120) {
                System.out.println("Old Senior Citizen");
            } else {
                System.out.println("Invalid Age");
            }
        }

        }

    }


//Write a program that can define the age groups of a person.
//
//Have a pre-condition(Outer if): if age > 120 or less than 0 ==> invalid entry, and nothing else is checked.
//
//Age groups:
//Infant (< 1 year), Toddler (3 - 5), Kid (6 - 9), Pre-Teen (10 - 12),
// Teenager (13 - 17), Young Adult (18 - 20), Adult (21 - 39),
// Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54), Very
// Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74),
// Senior Citizen (75 - 84), Old Senior Citizen (85+)
//
//Based on the given age find and print which age group they are in.
//
//=======================================================
//[EligibleToVote]
//
//Redo the EligibleToVote task but this time ask which country the person has citizenship for
//
//If the citizenship is for the USA then ask user to enter their age. Use the age to figure out if they vote.
//
//    -> 18+ : You are eligible to vote
//    -> < 18: You must be at least 18 years old to vote
//
//If the person is not a USA citizen: You must be US citizen in order to vote"