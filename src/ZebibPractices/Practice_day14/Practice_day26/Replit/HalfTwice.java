package ZebibPractices.Practice_day14.Practice_day26.Replit;

public class HalfTwice {
    public static void main(String[] args) {

        //String word = "javav";
        //YOUR CODE HERE

//        int charCount = word.length();
//        if (charCount == 1) {
//            System.out.println(word + word + word);
//        }else if (charCount == 2) {
//            System.out.println(word + word);
//        }else if (charCount >= 3){
//            int middleIndex = charCount/2;
//             if (charCount % 2 ==1 ) {
//                 System.out.println(word.charAt(middleIndex));
//
//             }else {
//                 System.out.println(word.substring(middleIndex - 1, middleIndex+1));
//             }
//
//        }
        String word = "xjavaX";
        String firstCharIndex = word.substring(0,1);
        String lastCharIndex = word.substring(1,word.length()-1);

        if (firstCharIndex.equalsIgnoreCase("X")) {
            word =word.substring(1);
        }
        if (lastCharIndex.equalsIgnoreCase("X")) {
            word = word.replace("X","");

        }
        System.out.println( word);



    }
}
