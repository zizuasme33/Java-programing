package day11_comparison_operators;

public class PrePost_IncrementDecrement_Operators {
    public static void main(String[] args) {

        // Pre- increment
        
        int num1 =10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Post - Increment -- add 1 afterwards

        int num3 = 8;
       // int num4 = num3;
        //num3++; // add 1
        int num4 = num3++;
        System.out.println("num3 = " + num3); // 8+1 = 9
        System.out.println("num4 = " + num4);// 8 (when we assign

        int apples = 5;
        int basket = ++ apples;
        System.out.println("apples = " + apples); // increase first then you put the basket
        System.out.println("basket + " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);// in total ypu have 16 kiwi

        System.out.println("kiwiBasket = " + kiwiBasket);// 15, because you put kiwi in the basket first ypu will have 15 and one extra is there
        // and you forget to put the extra in the basket which ypu will have 15.

        int cars = 5;
        System.out.println(++cars); //  add first and print ; will print = 6

        int sedans = 10;
        System.out.println(sedans++); // print sedan first  = will print = 10 will not add because it's after
        System.out.println(sedans); // now will print 11

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);








    }

}
