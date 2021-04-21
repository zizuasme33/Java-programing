package ZebibPractices.Practice_day14.Practice_day32;

import java.util.Arrays;

public class SplitArrayPRactice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

//        System.out.println("-------FIND THE FIRST INDEX OF 'Gloves' in items arrays -----");
//
//        for (int i = 0; i < items.length; i++) {
//            if (items[i].equalsIgnoreCase("gloves")) {
//                System.out.println("gloves at index of " + i);
//                break;
//            }
//        }
//        System.out.println("-----Set boolean to true if first 'iPad' is found");
//
//        boolean itemFound = false;
//
//        for (String each : items) {
//            if (each.equalsIgnoreCase("ipad")) {
//                itemFound = true;
//
//                break;
//            }
//        }
//        System.out.println("itemFound = " + itemFound);
//
//        for (int i = 0; i < prices.length; i++) {
//
//            System.out.println(items[i] + " $" + prices[i] + " " +itemIDs[i]);
//        }
//
//        System.out.println("-----Look for 'Jacket' in items and print ll details");
//
//        for (int i = 0; i < items.length; i++) {
//            if (items[i].equalsIgnoreCase("jacket")) {
//                System.out.println(items[i] + " S" + prices[i] + " #" + itemIDs[i]);
//                break;
//            }
//
//        }
//

            /*  2nd Practice -  Print array values in string in same line with no loops */
//        System.out.println(Arrays.toString(items));
//        System.out.println(Arrays.toString(prices));
//        System.out.println(Arrays.toString(itemIDs));
//
//        System.out.println("--------- Finding Max And Min prices ----------");
//
//         double maxPrice = 0;
//         int indexOfMaxPRice = 0;
//        double min = prices[0];
//
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                indexOfMaxPRice = i;
//            } else if (prices[i] < min) {
//                min = prices[i];
//               // System.out.println("index Of min PRice = " + i);
//
//            }
//        }
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("indexOfMaxPRice = " + indexOfMaxPRice);
//        System.out.println("min = " + min);
//        System.out.println(items[indexOfMaxPRice] + " $" + prices[indexOfMaxPRice] + " #" + itemIDs[indexOfMaxPRice]);
//
        /* 3rd practice SplitMethods */

//        String words = "java:python:selenium:html";
//        String [] wordsArray = words.split(":");
//        System.out.println(Arrays.toString(wordsArray));
//        System.out.println("words length array = " + wordsArray.length);
//
//        for (String each : wordsArray) { // this will help us to print in separate line
//            System.out.println(each);
//        }
//        String sentence = "today I am coding java arrays";
//        String [] wordsSentences = sentence.split(" ");
//        System.out.println(Arrays.toString(wordsSentences));
//        System.out.println("first word = " + wordsSentences[0]);
//        System.out.println("first word = " + sentence.split(" ")[0]); // will give us 0 index
//        System.out.println("Number of words in sentence is = " + wordsSentences.length);
//
//
//        for (String each : wordsSentences) {
//            System.out.println(each);
//        }

        /* 4th Practice Sentence Split */

//        String sentence = "java is fun";
//        String [] word = sentence.split(" ");
//        System.out.println("1st word = " + word[0]);
//        System.out.println("2nd word = " + word[1]);
//        System.out.println("3rd word = " + word[2]);
//
//        for (String each : word) {
//            System.out.println(each);
//        }

//        String googleResult = "About 1,810,000 results (0.68 seconds)";
//        String [] result = googleResult.split(" ");
//        System.out.println("count = " + result[1]);
//        System.out.println("Seconds = " + result[3].substring(1));
        
        /* 5th Practice reverse sentence */
 
//        String sentence = "today is java";
//        String [] words = sentence.split(" ");
//        String reversedWords = "";
//
//        for (int i = words.length-1; i >= 1; i--) {
//            reversedWords += words[i] + " ";
//        }
//        System.out.println("reversedWords = " + reversedWords.trim());

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        String []zoneDeploy = zones.split(",");

        for (String eachZone : zoneDeploy) {
            System.out.println(app + " = " + eachZone);
        }















    }

}
