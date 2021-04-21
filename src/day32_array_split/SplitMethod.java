package day32_array_split;
import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
                    //     0    1       2       3
        String words = "java:python:selenium:html";
        String [] wordsArray =  words.split(":") ;
        System.out.println(Arrays.toString(wordsArray)); // Printing words in one line
        System.out.println("length of array =  "+wordsArray.length);



        for (String each : wordsArray) { // will help us to print in separate line
            System.out.println(each);
        }

        System.out.println("------- **********------------");

        // popular INTERVIEW QUESTIONS *****

        String sentence = "today I am coding java arrays";
        String [] wordsInSentence = sentence.split(" ");
        System.out.println(Arrays.toString(wordsInSentence));
        System.out.println("first word: " +wordsInSentence[0]);
        System.out.println("first word: " +sentence.split(" ")[0]); // will give us index
        System.out.println("Number of words in sentence is = "+wordsInSentence.length);


        for (String each : wordsInSentence) {
            System.out.println(each);
        }




    }
}
