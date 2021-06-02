package OfficeHoursday1.Practice_day_31_Tue_June1;

    /*
            create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        hasCodingSkills

                    Constructor:
                        accepts and sets all instance variables

                    Actions:
                        getter/setters, coding(),  fixingBug(), toString()
     */

    public class Developer {

        private String name;
        private int employedId;
        private String jobTitle;
        private double salary;
        private static boolean hasCodingSkills = true;

        public Developer(String name, int employedId, String jobTitle, double salary) {
            this.name = name;
            this.employedId = employedId;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public void coding() {
            System.out.println(this.name + " is coding");
        }

        public void fixingBug() {
            System.out.println(this.name + " is fixing a bug");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEmployedId() {
            return employedId;
        }

        public void setEmployedId(int employedId) {
            this.employedId = employedId;
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

        public static boolean isHasCodingSkills() {
            return hasCodingSkills;
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "name='" + name + '\'' +
                    ", employedId=" + employedId +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
