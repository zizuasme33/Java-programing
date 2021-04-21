package day08_casting_scanner;

import java.sql.SQLOutput;

public class CastingExamples {
    public static void main(String[] args) {

        // byte - short - int - long
        // small we can assign to larger
        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 100;
        long num5 = num4;
        // float - double ( dont need paranthesis b/c we can assign smaller to larger)
        float num6 = 123.4F;
        double num7 = num6;

        int num8= 3456;
        double num9 = num8;
        System.out.println(num8);//3456
        System.out.println("num9 = " + num9);// 3456.0

        System.out.println("=============================");
        int num10 = 22;
        byte num11 = (byte)num10;// we need to casting it  and put paranthesis b/c int is larger than byte.
        short num12 = (short)num10;// we need to casting b/c int is bigger than short.
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        double num13= 55.3;
        float num14 = (float)num13;// double is larger than float, so we need to cast it.
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16= (int)num15;
        System.out.println("num15 = " + num15);//1234.5
        System.out.println("num16 = " + num16);// 1234 =will come out whole number and loose the decimal points.

        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

        char letter = 'Z'; // 90
        int numLetter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numLetter = " + numLetter);

        //int num = (int)123.3;
       // System.out.println("num = " + num);
        
        //double num = 44;
        //double d = num;
        //System.out.println("d = " + d);

        //from today practice zizi


        //System.out.println();
        //byte ziz = 100;
        //short ziz1 = ziz;
        //int ziz2 = ziz;
       // long ziz3 = ziz;
       // int ziz4 = ziz;
        //double ziz5 = ziz;
        //System.out.println("ziz1 = " + ziz1);
        //System.out.println("ziz2 = " + ziz2);
        //System.out.println("ziz5 = " + ziz5);
        //int hen1 = 50;
       // byte hen2 = (byte)hen1;
        //short hen3 = (short)hen1;
        //System.out.println("hen1 = " + hen1);
        //System.out.println("hen2 = " + hen2);
        //System.out.println("hen3 = " + hen3);

        
        


    }
}
