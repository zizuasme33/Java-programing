package ZebibPractices.Practice_day14.Replit;
import java.util.*;

public class loops {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String shoppingListReport = scan.next();
//        String item = scan.next();
//        String countinue = "";
//        double price = 0;
//        int count = 1;
//        double totalPrice = 0;
//
//
//        do {
//
//            System.out.println("Enter Item"+ item + " and its price");
//            item = scan.next();
//            price = scan.nextDouble();
//            totalPrice += price;
//
//            shoppingListReport = "Item" + count + ": " +item + " Price:" + price;
//            System.out.println("Add one more item?");
//            countinue = scan.next();
//            if (countinue.equals("yes")) {
//                shoppingListReport += ", ";
//            }
//            count++;
//
//        } while (countinue.equals("yes") && count <= 10 );
//        System.out.println(shoppingListReport);
//        System.out.println("Total price: " +totalPrice);

//        String word = " javapython";
//        String word2 = word.substring(0,4);
//        if (word.substring(1,5).contains("java") && word2.contains("java")) {
//            System.out.println (true);
//        } else {
//            System.out.println(false);
//
//
//        }
//        String word = "word";
//        String separator = "x";
//        int count = 3;
//        String chain = "";
//        for (int i = 0; i < count; i++) {
//            chain = word + separator;
//
//           }
//        chain +=word;
//        System.out.println( chain);
   // }

   //
    /**
     * year 1 - growth 1 cm
     * tree size: 1cm
     *
     * year 2 - growth 1 cm
     * tree size: 2cm
     *
     * year 3  - growth 1 cm
     * tree size:3cm
     *
     * year 4 - growth 2 cm
     * tree size: 5cm
     *
     * year 5 - growth 2 cm
     * tree size: 7cm
     *ree size: 7cm
     * year 6 - growth 2 cm
     * tree size: 9cm
     *
     * ... until you reach year 10
     *
     *
     */

   // int year = 1;
    int growth =1;
    int treeSize = 1;
        for (int year = 1; year <= 10; year++) {



        if (year == 1) {

            System.out.println("year " + year + " - growth " + growth + " cm");
            System.out.println("tree size: " + treeSize + "cm");

        }else if (year <= 3) {
            treeSize +=1;

            System.out.println("year "+year+" - growth " +growth+" cm");
            System.out.println("tree size: " +treeSize+"cm");




        }else if (year >= 4){
            growth = 2;

            treeSize +=2;
            System.out.println("year "+year+" - growth " +growth+" cm");
            System.out.println("tree size: " + treeSize +"cm");


        }


    }


        }

}
