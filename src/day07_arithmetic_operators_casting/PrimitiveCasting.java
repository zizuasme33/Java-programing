package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int num1 = 100;
        byte b1 = (byte)num1; // this will work coz we already assign it.
        short shNum = (short)num1;
        long lNum1 = num1;// will work coz it's bigger than int

        System.out.println(num1);
        System.out.println(b1);
        System.out.println(shNum);
        System.out.println(lNum1);

        //Practice from today

       // int zi = 70;
        //byte bib = (byte)zi;
        //short zii = (short)zi;
       // System.out.println(zi);//70
        //System.out.println(bib);//70
        //System.out.println(zii);//70


    }
}
