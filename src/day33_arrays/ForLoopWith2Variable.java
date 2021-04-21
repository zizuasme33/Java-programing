package day33_arrays;

public class ForLoopWith2Variable {
    public static void main(String[] args) {

        for (int i =1, j = 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);

        }

        System.out.println("--------------- 2 way for loop ----------------");
        for (int i = 1, j = 5; j >= 0;i++, j-- ) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // my Practice
//
//        String names = "Zebib Asmelash";
//        for (int i = 0, j = names.length()-1; j >= 0; i++, j--) {
//            System.out.println(names.charAt(i) + " " + names.charAt(j));


      //  }

    }
}
