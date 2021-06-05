package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        // this code runs one time only
        StaticBlockDemo st1 = new StaticBlockDemo(); // static(10) run one time > constructor(5) run each time
        StaticBlockDemo st2 = new StaticBlockDemo();   // constructor(5) method will run each time
        StaticBlockDemo st3 = new StaticBlockDemo(); // constructor(5)
        System.out.println(StaticBlockDemo.num); // total 25
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);  // 25 + 50 = 75

    }
}
