package OfficeHoursday1.Practice_day_09;

/**
 * Given the following information: hourly rate, weekly hours, and number of weeks. Check if all the inputs are valid and then calculate the salary.
 * - hourly rate cannot be negative or zero
 * -> If invalid print: Hourly Rate cannot be Negative or Zero
 * - weekly hours cannot be zero, negative or more than 65
 * -> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
 * - number of weeks cannot be less than 1 and more than 52
 * -> If invalid print: Number of weeks cannot be less than 1 or greater than 52
 * Equation: salary = hourly rate * weekly hours * number of weeks
 */


public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIaValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksAreValid = numberOfWeeks  > 0  && numberOfWeeks <=52;


        if (hourlyRateIaValid) {
            // check other conditions
            if (weeklyHoursAreValid) {

                if (numberOfWeeksAreValid) {
                    System.out.println("Salary is: " + (hourlyRate * weeklyHours * numberOfWeeks));
                }else {
                    System.out.println("number of weeks cannot be less than 1 and more than 52");
                }

            }else {
                System.out.println("weekly hours cannot be zero, negative or more than 65");
            }

        }else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }

        // or you can do this way as well


//        if (hourlyRateIaValid && weeklyHoursAreValid && numberOfWeeksAreValid) {
//            System.out.println("Salary is: " + (hourlyRate * weeklyHours * numberOfWeeks));
//        }else {
//            if (!hourlyRateIaValid) {
//                System.out.println("Hourly Rate cannot be Negative or Zero");
//            }else if (!weeklyHoursAreValid) {
//                System.out.println("weekly hours cannot be zero, negative or more than 65");
//            }else {
//                System.out.println("number of weeks cannot be less than 1 and more than 52");
//            }
   //     }

    }
}

