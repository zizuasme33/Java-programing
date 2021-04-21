package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after kenafa = " + balance);

        // second kenafe is 50% off. lets buy it
        kenafa  = kenafa / 2;
        System.out.println("kenafa = " + kenafa);
        //bye it and decrease balance with kenafa;
        balance = balance - kenafa;
        System.out.println("balance after second kenafa = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after  plov = " + balance);

        double icedTea = 3.0;
        System.out.println("iceTea = " + icedTea);

        //buy 4 ice teas and decrease balance
        balance = balance - icedTea * 4; // or (icedTea * 4)
        System.out.println("balance after 4 iced teas = $" + balance);

        //return baklava
        System.out.println("Returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava is = $" + balance);



        
    }
}
