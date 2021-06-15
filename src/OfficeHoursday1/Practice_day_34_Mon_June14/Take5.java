package OfficeHoursday1.Practice_day_34_Mon_June14;

/*
        Create a class Take5 [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final


Create a class Twix [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final, sub class

Create a class CandyFactory [ No inheritance with Candy classes ]

    This class is to create objects of Candy, Take5, Twix and see how they are working


 */

public class Take5 extends Candy{

    public Take5( int quantity, boolean hasPeanuts) {
        super("Reese", quantity, hasPeanuts);
    }

}
