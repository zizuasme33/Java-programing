package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) throws InterruptedException {
        /**
         * bellow is infinite loop with for loop like : while (true) {  }
           for (;;) {
           System.out.println("Java is fun");
           }
         */

       //    (initialization)       ( condition)                   (increase)
        //for  (int i = 0;      i <= 5;(control the loop )          i++(update){

        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world");
           // Thread.sleep(1);
        }
//      for loop: 1 - 10. print numbers


    //   initialization  + condition then println then update
        // 1)step       2)step        4)step
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i); // 3 step
        }

    }
}
