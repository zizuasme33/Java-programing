package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);

        // this can not work in asList because size cannot be modified
       // nums.add(100);  UnsupportedOperationException
        //nums.remove(0); UnsupportedOperationException
       // nums.clear(); UnsupportedOperationException

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 54, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(33));
        System.out.println("numsList = " + numsList);

        /**
            List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius
            int caffeineAmount = 0;
            monster , red bull, celsius:
            caffeineAmount = 150
              coffee, kambucha:
              caffeineAmount = 112
             tea, coke, pepsi, mdew:
              caffeineAmount = 35
         **/

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {

            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);

            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);

            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }

        }

        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "tea": case "coke": case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
            }
        }
        /** IQ Question how to loop using Lambda Expressions ( -> ) to specify the action **/

        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase())); // this all include is a loop
        
        drinksWithCaffeine.forEach(each -> {
            System.out.println("----------");
            System.out.println("each = " + each);
            System.out.println("----------");
        });
        
        
    }
}
