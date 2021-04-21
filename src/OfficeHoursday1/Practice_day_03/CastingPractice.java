package OfficeHoursday1.Practice_day_03;

public class CastingPractice {
    public static void main(String[] args) {

        //byte - short - int - long - float - double

        // by default whole number will be rad as int datatype

        //by default decimal numbers will be read as double datatype.

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (int)d;
        int i2 = (int)d;
        System.out.println(i);//5
        System.out.println((double)i);

        float f = 3.54F; // will tell the compiler that we need float
        float f2 = (float)3.54; // float = ( float) double (casting to double)

        float f3 = 5; // float = ont b/c = int smaller than float ---> 5.0
        float f4 = 5.5F; // float = double

        long l = 22313; // long = int
        long l2 = 3123123337443L;
        //long l2 = (long)3123123337443; does not work because the number is to big for int, to caST

        System.out.println(l);
        System.out.println((double) l );
        System.out.println((float) l );
        System.out.println(l2);
        double million = 1_000_000; // the underscore is like a coma to print one million
        System.out.println(million);





    }
}
