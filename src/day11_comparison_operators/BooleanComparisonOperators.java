package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        // only values
        System.out.println(10 == 10); // when two (==) it mean equal true 10  equal 10
        System.out.println(1000 > 10);// ture 1000 greater than 10
        System.out.println(985.44 < 98547.8); // true less than
        System.out.println(10 <= 11);// true ( less than or equal)
        System.out.println(5 >= 3);// true ( more than or equal)
        System.out.println(-100 != 44); // true -100 is not equal 44 , (!=) not equal ,

        // assign variables
        System.out.println("===========================");
        int a = 100;
        int b = 200;
        System.out.println(a == b);// false
        System.out.println(a > b);// false
        System.out.println(a < b);// true
        System.out.println(a >= b);// false
        System.out.println(a <= b);// true
        System.out.println(a != b );// true a : 100 b : 200

        System.out.println("==========================");
        // because of the comparison operator we can assign number in boolean.
        boolean result = 5 == 5;
        System.out.println("result = " + result);// true

        result = 33 > 44;
        System.out.println("result = " + result); // false 

        result = 88 < 99;
        System.out.println("result = " + result); //ture
        
        result = 10 >= 10;
        System.out.println("result = " + result); // true

        result = 123 < + 123;
        System.out.println("result = " + result);//true

        result = 2 != 2;
        System.out.println("result = " + result); // false

        System.out.println("******************************");

        String city = "Seattle";
        System.out.println(city == "seattle");// false
        System.out.println(city == "Baku");//
        System.out.println(city != " Fairfax");

        String name = " Nadir";
        boolean checkName = name == " Nadir";
        System.out.println("chechName = " + checkName); // true
        
        checkName = name!= "kuzzat";
        System.out.println("checkName = " + checkName); // true
        


        



    }
}
