package day15_logicalops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = "  + (true || true));// printing string and boolean
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges >4); // true || true
        if (apples >3 || oranges > 4) {
            System.out.println("No need to buy any fruits today");
        }else {
            System.out.println("Need to get some fruits");

        }

                            // true   or     // false // overall = True
        System.out.println(apples > 2 || oranges >10);
                            // true and  // false = False
        System.out.println(apples > 2 && oranges >10);


        if (apples > 2 || oranges >10) {
            System.out.println("Looks like we are good with fruits");
        }else {
            System.out.println("Need to buy some fruits");
        }
                          //  False   or  False = False
        System.out.println(apples == 0 || oranges ==0);

        if (apples ==0 || oranges ==0) {
            System.out.println("We need to purchase some fruits");
        }else {
            System.out.println("We are good with fruits");
        }

    }
}


