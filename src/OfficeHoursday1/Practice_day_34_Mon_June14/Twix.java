package OfficeHoursday1.Practice_day_34_Mon_June14;

/*
        Create a class Twix [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final, sub class
 */

/*
        Twix is a Candy
        Twix is a Object
        Twix is a brand
        Twix is a quantity

 */

public class Twix extends Candy {

    // constructor cannot be override, instead we use super
    public Twix( int quantity, boolean hasPeanuts) {
        super("Mars", quantity, hasPeanuts);
    }
}
