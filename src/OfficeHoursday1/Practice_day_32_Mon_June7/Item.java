package OfficeHoursday1.Practice_day_32_Mon_June7;

/*
Create a class Item

    -> Instance variables:
        - name (String), price (double), quantity (int)

    -> Constructor:
        - Accepts and initializes all three variables

    -> Instance methods:
        - toString(): returns information about Item
 */

public class Item {

    String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity= quantity;

    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
