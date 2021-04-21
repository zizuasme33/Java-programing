package ZebibPractices.Practice_day14.Practice_day29;

public class NestedLoop_practice {
    public static void main(String[] args) {
              // 1st practice
//        for(int i = 1; i <= 5; i++) {
//            System.out.print( "Outer " +i + " = ");
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }

        // 2nd practice
       // String stars = "";

//        for(int outer = 1; outer <= 10; outer++) {
//            //System.out.print("*");
//            for (int inner = 1; inner <= outer; inner++) {
//                System.out.print("*\t");
//            }
//            System.out.println(" ");
//        }
//
//        for(int outer = 1; outer <= 10; outer++) {
//            //System.out.print("*");
//            for (int inner = 10; inner >= outer; inner--) {
//                System.out.print("*\t");
//            }
//            System.out.println(" ");
//        }
//        for(int outer = 1; outer <= 10; outer++) {
//            //System.out.print("*");
//            for (int inner = 1; inner <= outer; inner++) {
//                System.out.print("*\t");
//            }
//            System.out.println(" ");
//
//
//        }

//        for(int outer = 1; outer <= 10; outer++) {
//
//            for (int inner = 1; inner <= 10; inner++) {
//                System.out.print( " | " +outer +  " x " + inner +" = " + +outer* inner  + "|\t");
//            }
//            System.out.println("");
//
//
//        }

//        String word = "java";
//        for(int i = 0; i < word.length(); i++) {
//            for (int j =0; j <= i; j++) {
//                System.out.print(word.charAt(j));
//            }
//            System.out.println();
//        }
//        for(int i = 0; i < word.length(); i++) {
//            for (int j = i; j < word.length(); j++) {
//                System.out.print(word.charAt(j));
//            }
//            System.out.println();
//        }
       // String word = "java";
//
//        for(int outer = 0; outer < word.length(); outer++) {
//            int count = 0;
//            //System.out.println(word.charAt(outer));
//            for (int inner = 0; inner < word.length(); inner++) {
//             //  System.out.print(word.charAt(inner));
//                if (word.charAt(outer) == word.charAt(inner)) {
//                    count++;
//
//                }
//
//            }
//            System.out.println(word.charAt(outer)+ " = " + count);
//
//        }
        
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
                
            }
            System.out.println("i = " + i);
        }




    }

}
