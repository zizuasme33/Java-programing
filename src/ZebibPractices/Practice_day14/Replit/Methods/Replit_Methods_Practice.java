package ZebibPractices.Practice_day14.Replit.Methods;

import com.sun.org.apache.bcel.internal.generic.FSUB;

public class Replit_Methods_Practice {
    public static void main(String[] args) {

        // word count;
        String word = "java bin n";

        int count = 0;

        String wor = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                count++;
            }

        }

        //  System.out.println("count = " + ++count);

        // replit bad Word

        String tex = "one two three";
        String badword = "two";

        String words = "";
        int cout = 0;

        for (int i = 0; i < tex.length(); i++) {
            for (int j = 0; j < badword.length(); j++) {
                if (tex.charAt(i) != badword.charAt(j)) {
                    cout++;
                    if (cout > 1) {
                        words += tex.charAt(i);
                    }


                }
            }


        }
        System.out.println(words);

//       String target = "longword"; wor = "foo";
//       String result = "";
//
//        for (int i = 0; i < target.length(); i++) {
//           result += target.charAt(i);
//           if (i == 2) {
//               result += wor;
//           }
//
//        }
//
//        System.out.println("result = " + result);

//        
//        String str = "aaa";
//        
//        String firstChar = "";
//        for (int i = 0; i < str.length(); i++) {
//            firstChar = str.replaceFirst(str.charAt(i) + "", "");
//
//        }
//
//        System.out.println("firstChar = " + firstChar);

        // }

        String text = "bla bla ";
        int maxLength =3 ;
        int countW = 0;

        String result = "";
        for (int i = 0; i < text.length(); i++) {
           // result +=text.charAt(i);
            if (i <= text.charAt(maxLength) ){
                countW++;
                if (countW <= 3)
                result += text.charAt(i);
            }
        }

        System.out.println("result = " + result);


    }

}
