package OfficeHoursday1.Practice_day_31_Tue_June1;

/*

- create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, smokeTesting(),  creatingTicket(), toString()

            -> Optional: static variable
 */

public class Tester {
        // This alla in here are instance variable
    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
    //name = name ; // we can not use this local variable always prioritize, it means always it will refer this name
        // This all are local variable
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void smokeTesting(){
        System.out.println(this.name + " is running smoke test");
    }

    public void creatTicket() {
        System.out.println(this.name + "is creating a ticket");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
