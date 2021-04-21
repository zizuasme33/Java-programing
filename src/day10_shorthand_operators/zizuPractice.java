package day10_shorthand_operators;
//import java.util.Scanner;
public class zizuPractice {
    public static void main(String[] args) {
      // Scanner scan = new Scanner(System.in);
        //System.out.println("How is the weather in your state?");
        //String weather = scan.nextLine(); //next() only accept in  String or scan.nextLine() for second line
       // int weather2 = scan.nextInt(); // for int we use scan.nextInt()
       //System.out.println("Weather seems " + weather +  weather2 + " - and a little bit "  +  " so nice today");
        
        //String word = scan.next();// scan.next() if we will print wooden spoon, will only print wooden.
       // System.out.println("word = " + word);
        

        //2nd example ( printing there is  BUG/ GLITCH) scan.next(), scan.nextLine()
        //double rent = scan.nextDouble();
        //String month = scan.next();// will ignore String if we use nexLine, after nextInt, nextDouble, nextBoolean, and will take only the new line charavter
        //System.out.println("Rent = " + rent);
        //System.out.println("Month= " + month);
        
        //3 example Update variable value
        
        //int count1 = 10;
       // count1 = 15;
        //increase value by 5
        int count = 10;
        count = count + 5; // will print 15
        System.out.println("count = " + count);
        double fuel = 2.99; // decrease value by 1
        fuel = fuel - 1.0;// will print 1.99
        System.out.println("fuel = " + fuel);

        //changing variables by adding and subtracting
        double balance = 100.0;
        double price1 = 10.0;
        balance = balance - price1;
        balance = balance - 5.0;
        System.out.println("balance = " + balance); // 85 (100-10-5)

        // shorthand assignment with updating the same value
        int num = 10;
        num = num + 1;
        System.out.println("num = " + num); // 11

        double price = 2.5;
        price = price *2;
        System.out.println("price = " + price); //5.0

        //adding 3 to num1 variables with shorthand method
        int num1 = 5;
        num1 = num1 + 6;
        num1+= 3;
        System.out.println("num1 = " + num1); // 14

       // Increment and decrement
        // +=, -=, *=, /=, %=
        int c = 2;
        c ++; // each time we use shorthand c++ add by one
        c ++;
        System.out.println("c = " + c); // 4
        // 3 ways to ADD/MINUS 1 from variable;
        int n = 10;
        n = n +1;// traditional
        n ++;// using shorthand
        ++n;
        System.out.println("n = " + n);// 13
        int banana = 5;
        banana++; // or
        ++banana;
        System.out.println("banana = " + banana);// 7
        int apples = 8;
        apples--;
        --apples;
        System.out.println("apples = " + apples); // 6






        
        
        
        





    }
}
