package day28_Loops;

public class BreakVsContinue {
    public static void main(String[] args) {

        // Break Statement // 123

        for (int n = 1; n <= 5; n++)  {
                System.out.print(n);
            if (n ==3) {
                break;
            }

        }
        System.out.println();
        for (int i = 1 ; i <=5; i++) {

            if (i ==2 || i == 4) {
                continue; // go to next iteration. skip teh code below
            }
            System.out.println(i);
        }

    }
}
