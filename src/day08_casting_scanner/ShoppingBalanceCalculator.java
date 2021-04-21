package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double remainingBalance = balance -  price1 - price2 - price3;

       //  balance = remainingBalance;(if i declare it oit will print ( remaining )
        // or we can do like this -  double remainingBalance = balance -  (price1 + price2 + price3);
        System. out.println("Your initial balance: $" + balance);
        System. out.println("Your remainingBalance: $" + remainingBalance);

        int balanceWithNoCents = (int) remainingBalance;
        System.out.println("Your available balance with out cents is: $" + balanceWithNoCents);



        //balanceWithNoCents

        //your initial balance is : $345.55
        //your remaining balance : $199.13
        //balance with out cents : $ 219
        
        // from today practice zizi
        
        //double balance1 = 500.50;
        //double shoes = 150.0;
        //double dress = 100.50;
        //double perfume = 150.80;
        
        //double remainBalance = balance1 - shoes - dress - perfume;
        //System.out.println("balance1 = " + balance1);
        //System.out.println("remainBalance = " + remainBalance);
        //int raminBaWithNoCents = (int) remainBalance;
        //System.out.println("raminBaWithNoCents = " + raminBaWithNoCents);




    }
}
