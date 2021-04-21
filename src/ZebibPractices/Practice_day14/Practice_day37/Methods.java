package ZebibPractices.Practice_day14.Practice_day37;

public class Methods {
    public static void main(String[] args) {
        userName("cybertekstudent", "abc123");


        // RETURN Methods
        System.out.println(login("cybertekstudent", "abc123"));

        boolean isSuccessful = login("cybertekstudent", "abc123");
        System.out.println("isSuccessful = " + isSuccessful);
        if (login("zebib", "riding horse")) {
            System.out.println("success");

        }else {
            System.out.println("failed");
        }

    }

    public static void userName(String userName, String password) {
        String secretUserName = "Cybertekstudent";
        String secretePassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretePassword)) {
            System.out.println("Login successful, welcome cyberteckStudents");
        } else {
            System.out.println("Incorrect user name pr password");
        }

    }

    // return method

    public static boolean login(String userName, String password) {

        String secretUserName = "Cybertekstudent";
        String secretePassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretePassword)) {
            return true;
        }

        return false;

    }

}