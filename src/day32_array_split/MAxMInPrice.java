package day32_array_split;


import java.util.Arrays;

public class MAxMInPrice {
    public static void main(String[] args) {

        //                     0        1          2        3          4        5
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        // prints array values in String, in same line, with no loops
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        System.out.println("--------- Finding Max And Min prices ----------");


        double maxPrice = prices[0]; // assume first price is max
        int indexOfMaxPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }
        System.out.println("max price = " + maxPrice);
        System.out.println("index double minPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);



        double minPrice = prices[0]; // assume first price is max
        int indexOfMinPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }

        System.out.println("--------- find Min Price-------------");
        System.out.println("minPrice = " + minPrice);
        System.out.println("indexOfMinPrice = " + indexOfMinPrice);
        System.out.println(items[indexOfMinPrice] + " - $" + prices[indexOfMinPrice] + " - #" + itemIDs[indexOfMinPrice]);


    }
}
