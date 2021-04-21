package day32_array_split;

public class MallShopping {
    public static void main(String[] args) {
            String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
            double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
            int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

            System.out.println("-------FIND THE FIRST INDEX OF 'Gloves' in items array -----");
            //use for loop with condition
            for(int i = 0; i < items.length; i++) {
                if (items[i].equals("Gloves")) {
                    System.out.println("Gloves found at index " + i);
                    break; //exit for loop
                    //System.out.println(i + " - " + items[i]);
                }
            }

            System.out.println("-----Set boolean to true if first 'iPad' is found");
            boolean iPadExists = false;
            for(String item : items) {
                if(item.equalsIgnoreCase("iPad")) {
                    iPadExists =  true;
                    break;
                }
            }

            System.out.println("iPadExists = " + iPadExists);
        /**
         shoes - 99.99 - # 12345
         iphone 12 case - 39.99- # 12350
         */



        for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + " - $" + prices [i]  + "- #" + itemIDs[i]);
            }

        System.out.println("-----Look for 'Jacket' in items and print ll details");
        /*
        Jacket - 150.0  - #1234
         */

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " - $" + prices [i] + "- #" + itemIDs[i]);
                break;// stop searching after jacket is found
            }
        }


    }
}
