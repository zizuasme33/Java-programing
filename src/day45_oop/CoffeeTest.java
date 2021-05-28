package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        myCoffee.setType("Turkish Coffee");
        System.out.println("My coffee = "+ myCoffee.getType());
        //describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        // Add Another COFFEE OBJECT, Set Values, CAll Methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("Cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        //assign coffee1 object to coffee2
        //hey java, point coffee2 to same object to coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        // pont the same object as coffee2
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());

//        Coffee coffee4 = null; // reference variable does not refer/ point to any object in HEAP
//        coffee4.setType("turkish"); // NullPointerException





    }
}
