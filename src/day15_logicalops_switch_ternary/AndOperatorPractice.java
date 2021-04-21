package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
       String itemName = "Wooden Spoon";

       // && using will help you to decide if it's onsale and freeshipping to check i

        if (onSale && freeShipping) {

            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }

        // add to cars only when oit is freeShiping, onSale and itemName is "Wooden Spoon"

        if (freeShipping && onSale && itemName.equals("Wooden Spoon")) {
            System.out.println("Adding to cart - " + itemName);
        }else {
            System.out.println("Continue shopping for good on deals on - " + itemName);
        }


    }
}
