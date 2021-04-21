package ZebibPractices.Practice_day14.Practice_day03;

public class FIrst_Practice_day03 {
    public static void main(String[] args) {

//        String sentence = "We study java not python";
//        int javaCt=0, pythonCt =0;
//
//        for(int i = 0; i < sentence.length()-4; i++) {
//            if (sentence.substring ( i , i +4).equals("java")) {
//                javaCt++;
//
//            }
//
//        }
//        for(int i = 0; i < sentence.length()-6; i++) {
//            if (sentence.substring ( i , i +6).equals ("python")) {
//                pythonCt ++;
//            }
//        }
//        System.out.println(javaCt == pythonCt);



//        String word = "catanddog";
//        int countOfCats = 0;
//        int countOfDogs = 0;

//        for (int i = 0; i <= word.length()-3; i ++) {
//
//            String countBoth = word.substring(i, i+3);
//
//            if (countBoth.equals("cat")) {
//                countOfCats++;
//
//            }else if (countBoth.equals("dog")) {
//                countOfDogs++;
//            }
//
//
//
//        }
//        System.out.println(countOfCats == countOfDogs);

//        String word = "howdyho";
//
//
//        for (int i = 0; i <= word.length()-1; i++) {
//            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
//                    || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
//                System.out.print(word.charAt(i));
//            }
//
//        }




        /**
         * public class Zombie {
         *     public static void main(String[] args) {
         *         Scanner scan = new Scanner(System.in);
         *         int inhabitants = scan.nextInt();
         *
         *         int day=0;
         *         while (inhabitants>0){
         *             System.out.println("Day "+day+"["+inhabitants+"]");
         *             inhabitants/=2;
         *             day++;
         *
         *
         *         }
         *         System.out.println("---- EXTINCT ----");
         */

//
//        int inhabitants = 6;
//        int day = 0;
//       for (int i = 0; i <= inhabitants; i++) {
//           inhabitants /=2;
//           day++;
//        System.out.println("Day " + day + "[" + inhabitants + "]");
//
//       }
//        System.out.println("---- EXTINCT ----");

        String word =  "xHiX" ;
        if (word.indexOf("x") == 0 || word.indexOf("X")>0) {
            System.out.println(word.substring(1, word.length()-1));

        }else if (word.indexOf("x")==0 || word.indexOf("X")==0){
            System.out.println(word.substring(0,word.length()-1));
        }else if (word.lastIndexOf("x")>0 || word.lastIndexOf("X")>0){
            System.out.println(word.substring(0,word.length()-1));
        }
        else{
            System.out.println(word);
        }


    }
}



