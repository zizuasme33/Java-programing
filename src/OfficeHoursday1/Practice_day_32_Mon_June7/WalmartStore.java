package OfficeHoursday1.Practice_day_32_Mon_June7;

    /*
     -> Instance variables:
        - location (String), totalWorth (double)
        - inventory (List of Items)

    -> Static variables:
        - company name (String),

    -> Constructor:
        - Accepts and initializes location, has an empty inventory

        - Overloaded: Accepts and initializes location, also accepts an ArrayList of Items for starting inventory

    -> Instance methods:

        - calculateWorth() -> Checks inventory, totals up amount of money all the items are worth. (each times price * quantity). Stores to the totalWorth variable

        - restockInventory(List of Item) -> Adds the given items to the store inventory.
            Challenge: If the item exists in the inventory already (same item name and price)


        - toString(): returns information about Item
     */

import java.util.ArrayList;

public class WalmartStore {

    String location;
    double totalWorth;
    ArrayList<Item> inventory;
    static String companyName;

    static {
        System.out.println("static block called");
        companyName = "Walmart";
    }

    public WalmartStore(String location) {
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    public WalmartStore(String location, ArrayList<Item> allItems) {
        this.location = location;
       // this.inventory = allItems; or -->
        this.inventory = new ArrayList<>(allItems);
        calculateWorth();

    }

    public void calculateWorth() {

        for (Item eachItem : inventory) {
            totalWorth += (eachItem.price * eachItem.quantity);
        }

    }

    @Override
    public String toString() {
        return "{" +
                "location='" + location + '\'' +
                ", totalWorth=" + totalWorth +
                ", inventory=" + inventory +
                '}';
    }
}
