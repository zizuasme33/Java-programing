package day43_list_custom_classes;
import java.util.*;

public class Company {
    public static void main(String[] args) {
        /**
         * add 3 objects of Employee class
         * assign name and job titles
         * call work method
         */

        // We are calling Employee class from the previous calass we added

        Employee emp1 = new Employee();
        emp1.name = "Zebib";
        emp1.jobTitle = "SDET";
        emp1.work();
        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);

        Employee emp2 = new Employee();
        emp2.name= "Nadir";
        emp2.jobTitle = "Full stack developer";
        emp2.work();
        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);

        //  emp1 = emp2;
        emp1.work();

    }

}

