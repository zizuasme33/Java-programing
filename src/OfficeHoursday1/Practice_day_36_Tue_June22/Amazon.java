package OfficeHoursday1.Practice_day_36_Tue_June22;

/*
    Create a concrete class Amazon
        - Inherit OnlineShopping and implement all abstract methods
 */
public class Amazon extends OnlineShopping implements AllowUsersToSell{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Card");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from amazon");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Amazon Seller");
    }
}
