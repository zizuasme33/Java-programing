package day13_conditional_statements;

public class ATMpincodeProgram {
    public static void main(String[] args) {

        System.out.println("******** WELCOME TO TD BANK ATM *********");
       // System.out.println("Inter your pincode");
        int secretPincode = 3000;
        int inputPincode = 3000;
        if(secretPincode == inputPincode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit ");
        }else{
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("please try again");
        }

        System.out.println("Thank you for using TD bank ATM");

    }
}
