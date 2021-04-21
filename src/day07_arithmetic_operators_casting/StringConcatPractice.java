package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("Java" + 5+3);//java53
        System.out.println("Java" + (5+3));// java8

        System.out.println(5+3 + " Java");// 8java
        System.out.println(5 + (3 + "java")); //53java

        System.out.println("hello" +  1+2+3); // hello123
        System.out.println("hello" +  (1+2+3)); //hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2);
        //hello friends
        System.out.println(str1 + " " + str2);
        // calculate
        int num1 = 7;
        int num2 = 8;

        System.out.println(num1 + num2);// 15 = will calculate

        System.out.println(num1 + " " + num2);// to print 7 8
        System.out.println(num1 +"" + num2);// to print 78

        // Practice from today

       // String fren = "Hello";//
       // String fren2 = "Yorda";//

        //System.out.println();//
       // System.out.println(fren + " " + fren2);//

       // System.out.println("Zizu" + 7 +3);// Zizu73
        //System.out.println("Zizu" + (7 +3));// Zizu10
       // System.out.println((7+3 )+"Zizu"); //10Zizu
       // System.out.println(7 + (3 + "Zizu"));//10


        //int z1 = 10, z2 = 30;//
       // System.out.println(z1 +" " + z2);//
    }
}
