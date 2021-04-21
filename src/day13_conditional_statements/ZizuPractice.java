package day13_conditional_statements;
import java.util.Scanner;
public class ZizuPractice {
    public static void main(String[] args) {
        // practice 4
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter City");

        String city = scan.next();
        if (city.equals("Alexandria")) {
            city = "Thats my city";
            System.out.println("Is Alexandria: " + city);
        } else {
            city = "that's not my city";
            System.out.println("is not Alexandria: " + city);
        }
    }
}


        // practice 2

        //double bonus = scan.nextDouble();
        // double salesAmount = scan.nextDouble();
        //if(salesAmount <= 100){
        //bonus = 100.0;
        // System.out.println("Great job" + bonus);
        // }else{
        // bonus = 50.0;
        // System.out.println("Good Job");

        // }
        //  System.out.println("Your total bonus : $" + bonus);

        // Practice 3
        //boolean isHungry = false;
        //if (isHungry) {
         //   System.out.println("I am hungry");
        //}else{
         //   System.out.println("I am not hungry");
       // }



//char letter = 'U';
//        if(letter=='Q'){
//            System.out.println("Letter is Q");
//        }else{
//            System.out.println("Letter is not Q");
//        }
//        // 2 practice
//
//        System.out.println("********* Welcome to td bank ATM");
//       int secretPincode = 2222;
//       int inputPincode = 2122;
//       if(secretPincode <= inputPincode){
//           System.out.println("welcome to your account");
//       }else{
//           System.out.println("incorrect pincode! " + inputPincode);
//       }
//       int temp = 71;
//       if(temp > 70){
//           System.out.println("It a beautiful day");
//       }else{
//           System.out.println("It is kind of cold today");









