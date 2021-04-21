package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            System.out.println(i );
            i++;
        }

        int apples = 0;
        while (apples <= 3)  {
            System.out.println("apples -> " + apples); // we can add apples++ in this line
            apples++;

        }
        System.out.println("apples = " + apples); // we have 4 apple ( 3 + apples ++ = 4)

        // infinite loop exp- for video games and keep runing
        while (true) { // condition is always true
            System.out.println("Hello world");
        }


    }
}
