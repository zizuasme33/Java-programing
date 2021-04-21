package ZebibPractices.Practice_day14.Replit.ArraysREplit;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

//        String [] words = {"", "", "", ""};
//        for (int i = 0; i <= words.length; i++){
//
//        }
//        double num [] = new double[4] ;
//        int a = 5;
//        num [0] = 1.0;
//        num[2] = 42.1;
//        num = new double[4];
//        num[1] = 17.2;
//        num[3] = num.length;
//        System.out.println(Arrays.toString(num));

//        String [] str = {"display", "pop", "mmet", "copy", "franchise"};
//        int a = str.length;
//        int b = str[5].length();
//        System.out.println(a + " "+ b);

       String []words = {"one", "two", "three", "four"};
       String [] n = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            n[i]= words[i] + words[i].length();

        }
        System.out.println(Arrays.toString(n));



    }
}
