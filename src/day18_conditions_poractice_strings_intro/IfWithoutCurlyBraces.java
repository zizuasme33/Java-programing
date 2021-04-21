package day18_conditions_poractice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
      String todaysClass = "python";

      if (todaysClass.equals("java"))
          System.out.println("java is fun");
      //   System.out.println("java if fun agian"); more than one can't work b/c without {} we can  only print single statement
      else
          System.out.println("it is not java. it is " + todaysClass);



      int score = 1;
      if (score == 2 )
          System.out.println("lowest score 1");// both of them printing out because condition if true
            System.out.println("lowest");// if condition is false will only print this line



        int a = 10;
        if (a == 1)  // when condition is true will print both line // if false will print the 3rd line
            System.out.println("a is 1");
            System.out.println("1 is 2");









    }
}
