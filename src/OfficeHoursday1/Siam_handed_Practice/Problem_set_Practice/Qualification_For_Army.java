package OfficeHoursday1.Siam_handed_Practice.Problem_set_Practice;

public class Qualification_For_Army {
    public static void main(String[] args) {

        String citizenShip = "USA";
        boolean resident = true;
        boolean highSchoolDiploma = true;
        int age = 18;
        boolean criteriaMet = true;

        if (citizenShip.equals("USA") && resident) {
            System.out.println("The person is citizen " + citizenShip);
        }else {
            System.out.println("The person must be a U.S. citizen or a resident");
        }
        if (age >=18 && age <= 35 )  {
            System.out.println(age);
        } else {
            System.out.println("Their age must be between 18 and 35 ");
        }
        if (highSchoolDiploma)  {
            System.out.println("They must have a high school diploma");
        }else {
            System.out.println("You must have a high school diploma ");
        }
        if (criteriaMet) {
            System.out.println("You are qualified for the US Army ");
        }else {
            System.out.println("Criteria are not met");
        }



    }

}







