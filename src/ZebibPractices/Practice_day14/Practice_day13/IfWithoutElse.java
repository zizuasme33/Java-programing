package ZebibPractices.Practice_day14.Practice_day13;

public class IfWithoutElse {
    public static void main(String[] args) {
        // Practice 1
        System.out.println("Are you sure you want to delete this file");
        char  selection = 'y';
        boolean answer = true;
        String result = "deleted";

        if (selection == 'y') {
            System.out.println("your file will be deleted" );
            answer = true;
            result = "deleted";
        }else {
            System.out.println("file deletion cancelled");
            answer = false;
            result = "not deleted";
        }

        System.out.println("did file get deleted - " + answer);
        System.out.println("result = " + result);

        //practice 2 on days

        int day = 1;
        if( day == 1) {
            System.out.println("Monday");
          //  if (day == 2) ( we can use either)
        }else if (day == 2) { // if
            System.out.println("Tuesday");
        }else if (day == 4) {
            System.out.println("Wednesday");

        } if (day == 4 ) {
            System.out.println("Thursday");
        }
        System.out.println("java day");

        // practice choose your language

        int selection2 = 5;

        if (selection2 == 1) {
            System.out.println("Hello thank for calling");
        }else if (selection2 ==2){
            System.out.println("Yekenyelna sle zdewelkumlna");
        }else if (selection2 == 3) {
            System.out.println("Merci. pour votre appel");
        }

        System.out.println("lets talk java and english, hello");

        // practice 3 Day activities

        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("lets go to park");
        } else if (weather.equals("rainy")) {
            System.out.println("stay home and code java");
        }else if(weather.equals("snowy")) {
            System.out.println("lets code java and drink hot chocolate");

        }else {
            System.out.println("Just keep coding java");
        }

        // Practice 4 Calculator

        int num1 = 20;
        int num2 = 10;

        char operator = '+';

        if (operator == '+') {
            System.out.println(num1 + num2);
        }else if (operator == '-') {
            System.out.println(num1 - num2);

        }else if (operator == '/') {
            System.out.println(num1 / num2);

        }else if (operator == '*') {
            System.out.println(num1 + num2);
        }else {
            System.out.println("Invalid operator");
        }

    }
}

