package OfficeHoursday1.Practice_day_38_Mon_Jul12;

public class PObjTest {
    public static void main(String[] args) {

        PA obj1 = new PA();
        Object obj2 = new PA();
        obj1.go();
        ((PA)obj2).go();

        PB obj3 = new PC();
        obj3.go();

        ((PC)obj3).math();
        ((PI)obj3).math();

        // ChromeDriver()
        // FireFoxDriver()

        PB obj4 = new PB(); // if it was new PB() -> PB GO
        obj4.go();
        ((PA)obj4).go();
        ((PI)obj4).math(); // ClassCastException(RunTime or Unchecked) we will get because we cant can not cast it and it's unhandled exception



    }

}
