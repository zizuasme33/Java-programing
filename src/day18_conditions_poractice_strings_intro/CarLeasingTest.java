package day18_conditions_poractice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {

        String make = "Mercedes";
        String  model = "E";
        double leasingPrice = 0.0;
        
        if (make.equals("Mercedes") && model.equals("E")) {
            leasingPrice = 500.0;

        }else if (make.equals("Mercedes") && model.equals("A")) {
            leasingPrice = 400.0;
        }

           // the top and bottom code will do the same thing with nested if

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasingPrice = 500.0;
            } else if (model.equals("A")) {
                leasingPrice = 400.0;
            }


        }else {
                System.out.println("invalid make");
                return; // exit program / exit main method
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasingPrice = " + leasingPrice);
        

       
        
    }
}
