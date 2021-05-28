package OfficeHoursday1.Practice_day_26_Wed_May12;

public class BankAccount {

        // this called instance variable

        String accountHolderName;
        int pin;
        double balance;
        long accountNumber;
                                    // this called local variable for this class
        public double getBalance(int inputPin) {
        if (pin == inputPin) {
            return balance;

        }else {
            return -1;
        }

    }

}
