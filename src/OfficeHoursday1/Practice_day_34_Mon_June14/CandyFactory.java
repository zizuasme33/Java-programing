package OfficeHoursday1.Practice_day_34_Mon_June14;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy = new Candy("generic", -10, true);
        System.out.println(candy);

        Take5 barOne = new Take5(4, true);
        System.out.println(barOne);

        Twix barTwo = new Twix(2, false);
        System.out.println(barTwo);

        System.out.println(Candy.getTotalNumberOfCandy());


    }
}
