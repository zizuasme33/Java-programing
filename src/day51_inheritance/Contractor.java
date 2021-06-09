package day51_inheritance;

public class Contractor extends Employee {
             // 1 ) purpose = lets everyone know you are overriding
            // 2) purpose = ensures that ths, method is being overridden. if not, it is shows ERROR
    @Override
    public double calculateSalary(double hourlyRate) {
        return 50 *40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
