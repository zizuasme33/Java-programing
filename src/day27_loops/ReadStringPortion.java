package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {

        String list = "cat,car, black cat, red car";
        //using substring print first 3 letters
        
            //                  list.substring(0, 3)
            // length-1 = 2 characters only, length-2 = 3 characters

        for (int i =0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i +3));
            if (list.substring(i, i +3).equals("cat") || list.substring(i, i+3) .equals("car")) {
                System.out.println("cat or car found");

            }
        }

        for (int i =0; i < list.length()-2; i++) {
            String part = list.substring(i, i + 3);
            System.out.println("part = " + part);
            if (part.equals("cat") || part.equals("car")) {
                System.out.println("cat or car found");

            }

        }





        /**
         *  int i = 0;
         *         System.out.println(list.substring(i + 3));
         *         i++;// 1
         *         System.out.println(list.substring(i, i +3));
         *         System.out.println(list.substring(i, i +3));
         *         System.out.println(list.substring(i, i +3));
         *         System.out.println(list.substring(i, i +3));
         */

    }
}


