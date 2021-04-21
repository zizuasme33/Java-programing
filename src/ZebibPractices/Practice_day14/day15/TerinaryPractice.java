package ZebibPractices.Practice_day14.day15;

public class TerinaryPractice {
    public static void main(String[] args) {

        int bill = 3000;
        int qty = 5;
        int discount = (bill > 2000) ? (qty > 10) ? 15 : 10 :5;
        System.out.println(discount);
        
        boolean a = false;
        boolean b = (a = true);
        System.out.println("a \n " + a);


    }
}
