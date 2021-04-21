package OfficeHoursday1.Practice_day_08;

import org.omg.CORBA.ARG_OUT;

public class ArmQualification {
    public static void main(String[] args) {

        String citizenShip = "USA";
        boolean resident = true;
        boolean hasDiploma = true;
        int age = 18;
        boolean criteriaMet = true;

        if (citizenShip.equalsIgnoreCase("USA") || resident) {
            if (age >=18 && age <= 35 ) {

                if (hasDiploma) {
                    System.out.println("They must have a high school diploma");
                }

            }else {
                System.out.println("You age must be between 18 and 35 ");
            }

        }else {
            System.out.println("You must be a U.S. citizen or a resident");
        }

    }
}
