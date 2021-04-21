package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3);//12
        System.out.println(10 - 5 + 3);//8
        System.out.println(10 - (5 + 3));//2

        System.out.println(2 * 3);//6
        System.out.println(2 * 3 / 3);//2
        System.out.println(20 / (2 * 2));//20 / 4 = 5

       // System.out.println(10 /0 );// can not divide by ZERO. error while cod running

        System.out.println(2 + 5 * 3);// = 17division and remainder calculate firs
        System.out.println((2 + 5) * 3);//21

        // INTEGER Division Problem.
        System.out.println(10/3);// will print only 3 remainder doesn't calculate it.
        System.out.println(5/2);// will be 2, will not print 2.5
        // Solution will be (use double or float for decimal)
        System.out.println(10.0 / 3.0); // 3.333
        System.out.println(5.0/2.0); // 2.5

        //Practice from today

 //       System.out.println( 8 + 5 * 2);// 18
   //     System.out.println((8 + 5) * 2);//26
     //   System.out.println(4 + 4 / 2);//6
       // System.out.println((4 +4) / 2);// 4
     //   System.out.println(7 / 3);// 3
       // System.out.println(7.0 / 3.0);// 2.5

    }
}
