package day37_mestods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("CybertekStudent", "abc1234"); // Positive Test // SUNNY DAY
       loginVoid("cyber","1234");//NEGATIVE TEST ? RAINY DAY SCENARIO
        loginVoid("", "");

        // Return Method

        System.out.println(login("CybertekStudent", "abc1234"));

        if (login("CybertekStudent", "abc1234")) {
            System.out.println("Login successful, welcome to Canvas");
            System.out.println("Select the course to continue");

        }else {
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if (login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calender");
        }else {
            System.out.println("Something wrong with your credential");
        }



    }

    // Void Method

    public static void loginVoid (String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretePassword = "abc1234";
         if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretePassword)) {
             System.out.println("Login Successful, welcome CybertekStudent!");
         }else {
             System.out.println("Incorrect username or password");
         }

    }

    // Return Method


    public static boolean login(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretePassword = "abc1234";
    //  return userName.equalsIgnoreCase(secretUsername)  && password.equals(secretePassword);
                     // this also works with out if statement because its boolean

        if (userName.equalsIgnoreCase(secretUsername)  && password.equals(secretePassword)) {
            return true; // return true, and exit method here. return false will not run
        }

            return false;


    }

}
