package OfficeHoursday1.Practice_day_36_Tue_June22;

/*
      Create a concrete class Target
        - Inherit Shopping and implement all abstract methods
 */

public class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }
}
