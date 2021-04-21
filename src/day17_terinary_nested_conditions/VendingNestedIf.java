package day17_terinary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "coke" ;
        String snackItem = "candy";


        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("Tea item is selected ");
                } else {
                    System.out.println("Coke item is Selected ");
                }
            }else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")) {
                System.out.println("chips option selected");
            }else {
                System.out.println("candy option selected");
            }
        }

        }
}
