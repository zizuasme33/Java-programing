package day17_terinary_nested_conditions;

public class AmazonPrimeShoping {
    public static void main(String[] args) {
        // PSEUDOCODE // code written in human language. then it will be translated java or other programing language

      double itemPrice = 45.0;
      boolean isPrimeMember = false;

      if (isPrimeMember) {
          System.out.println("Eligible for free 2 day shipping");

      }else {
          if(itemPrice > 25.0) {
              System.out.println("Eligible for free regular shipping");
          }else {
              System.out.println("Not eligible fir free shipping. Fee = 10$");
          }
      }





    }
}
