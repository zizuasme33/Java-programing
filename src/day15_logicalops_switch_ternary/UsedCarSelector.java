package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {

        double budget = 5000.00;
        String model = "Honda";
        double carPrice = 8999.0;

                // false                false                True =   overall will be False b/c of parenthesis
        if  (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda")))  {

                    // false                false                       true = overall will be True no parenthesis
        // if (carPrice <= budget && model.equals("Toyota") || model.equals("Honda"))  {

            //if (carPrice >= budget || model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) {

            System.out.println("Ready to purchase model = " + model + ", price = " + carPrice);
        }else {
            System.out.println("Not interested in model = " + model + ", price = " + carPrice);
        }


    }
}
