package day11_comparison_operators;

public class Zizu_Practice {

    public static void main(String[] args) {

        int num1 = 2;
        num1++;
        ++num1;
        System.out.println("num1 = " + num1); //4

        int num2 = 5;
        num2++;
        ++num2;
        System.out.println("num2 = " + num2);// 7

        // PRE INCREMENT// ALWAYS ADD ++ FIRST AND THEN NUMBER
        int ziz1 = 3;
        int ziz2 = ++ziz1;
        System.out.println("ziz1 = " + ziz1); // 4
        System.out.println("ziz2 = " + ziz2);// 4

        // POST INCREMENT
        int hen1 = 10;
        int hen2 = hen1++;
        System.out.println("hen1 = " + hen1);// 11
        System.out.println("hen2 = " + hen2);// 10


        int fke = 30;
        fke++;
        System.out.println("fke = " + fke);//31
        ++fke;
        System.out.println("fke = " + fke);//32

        //add first/ increment first / then print value
        fke = 20;
        System.out.println(fke++);//20 will not add because it's post
        // print first then add 1/Increment
        fke = 33;
        System.out.println(fke++); // 33 will not add coz it's post
        System.out.println(fke);// this will become 34 b/c the POST Increment will add on this

        fke = 50;
        System.out.println(++fke);// 51 this will only add 1 b/c it's PRE Increment
        System.out.println(fke);// 51 thi will the same result b/c it's already add

        //int fke1 = 40;
        //int fke2 = ++ fke1;
        //System.out.println(fke1); //41 will add 1 b/c it's Pre
       // System.out.println(fke2); //41 thi will the same result b/c it's already add

        int a = 50;
        int b = 22;
        int c = a++ + ++b; //+if ++a + ++b; result will be a=51, b= 23, c = 74(adding 23+51
        System.out.println("a = " + a); // this will result 51 b/c the next add 1 will assign to a
        System.out.println("b = " + b);// this will result  will be 23 b/c b is Pre increment and will add 1
        System.out.println("c = " + c);// will add all 50 + 22 + 1




    }

}
