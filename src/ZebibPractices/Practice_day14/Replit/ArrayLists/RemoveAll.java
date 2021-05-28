package ZebibPractices.Practice_day14.Replit.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<> (Arrays.asList("hi","hey","hi","yo"));
        String target = "hi";
        System.out.println(removeAll(list, target));

    }

    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord) {


            wordList.removeIf(each -> each.contains(targetWord));



        return wordList;
        }

}