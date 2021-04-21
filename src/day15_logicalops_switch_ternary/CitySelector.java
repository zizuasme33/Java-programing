package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Tampa";

        // Moscow or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")) {

            System.out.println("Willing to relocate to " + city);

        }else {

            System.out.println("Not considering - " + city);
        }
        String teacher = "Nadir";

        if (teacher.equals("Murodil") || teacher.equals ("Saim")) {

            System.out.println("It is java class with - " + teacher);

        } else {
            System.out.println("Soft skill class with - " + teacher );
        }

        // multiBranch

        //1 - teacher Siam or Murodil -> it is java class
        // 2 - teacher NAdir -> soft skill calss with
        // any other teacher -> some class with Gurhan/Akbar

        teacher = "Murodil";

        if (teacher.equals("Siam") || teacher.equals("Murodil")) {
            System.out.println("It is java class with " + teacher);

        } else if (teacher.equals("Nadir") ) {
            System.out.println("Soft skill class with - " + teacher );

        } else {
            System.out.println("Some other class with " + teacher);
        }

        // company = "Google", and salary > 100k

        String company = "NadirTech";
        double salary = 105_000.00;

        if (company.equals("Google") || salary >= 100_000.00) {

            System.out.println("Accept offer from " + company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }



    }
}
