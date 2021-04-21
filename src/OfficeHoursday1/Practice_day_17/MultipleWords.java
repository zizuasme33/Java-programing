package OfficeHoursday1.Practice_day_17;

public class MultipleWords {
    public static void main(String[] args) {

        /*
        Multiple Words Given a String of words that are separate by commas.
         Find and print any words that have more than one word
         Example
         Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer”
         Output: wooden spoons trash can
         */

        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] arrWords = words.split(", ");

        for(String eachWord : arrWords){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }

    }
}
