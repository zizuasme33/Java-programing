package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        int apples = 3;
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        System.out.println("=================================");

        int age = 2;

        //  Not  False (will make result) True
        if (!(age > 7)) {

            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " + age);

            }

        boolean isSmokingAllowed = false; // yes --> turn to true

        if (!isSmokingAllowed) { // result will be true
            System.out.println("Smoking is not allowed here. Exit");
        }else{
            System.out.println("This area is for smoking");
        }
        System.out.println("=================================");

        boolean isAffordable = true; //  will turn false
        if (!isAffordable) { // result will be false and will not print anything b/c it's false
            System.out.println("Item not affordable");
        }
        System.out.println("=================================");

        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";

        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect Password");

        }
        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect Password");
        }

    }
}
