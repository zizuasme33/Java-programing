package day05_primitives_concatanation;

import org.omg.CORBA.ServiceDetail;

public class JobInfo {
    public static void main(String[] args){
        String title = ("SDET");
        String company = ("Oracle");
        String jobDescription =("Tester");
        int salary = 45;
        int yearsExp = 2;
        boolean hasBenefit = true;

        System.out.println("Job Title: " + title+ "\nCompany name: " + company + "\nJob describtion: " + jobDescription +
                "\nSalary $: " + salary + "per/hr"+"\nYear Exp: " + yearsExp + "\nHas Benefit " +  hasBenefit);

        // instructor sample
        title = ("Java SDET");
        company = ("Palo Alto Networks");
        jobDescription =("Experince in java, selenium, Cuv=cumber, Tomato, JUnit");
        double Salary = 1234500;
        byte yearsOfExp = 3;
        boolean hasbenefit = true;
        System.out.println("*******************************");
        System.out.println("Title: " +  title);
        System.out.println("Company: " + company);
        System.out.println("JobDescription: " + jobDescription);
        System.out.println("Salary: $ " + Salary);
        System.out.println("Years Of Experience: " + yearsOfExp);
        System.out.println("Has benefit?  " + hasbenefit);
    }
}
