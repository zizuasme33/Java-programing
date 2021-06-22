package OfficeHoursday1.Practice_day_36_Tue_June22;

public class Ebay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to ebay");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Allow user to sell");
    }
}
