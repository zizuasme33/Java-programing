package day14_multi_branch_if_statement;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";

        if(weather.equals ("sunny")) {
            System.out.println(" go to park, hiking, and code java");
        }else if (weather.equals("rainy")) {
            System.out.println(weather + " - stay home, drink tea, and ode java");

        }else if (weather.equals("snowy")) {
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate, and code java ");

        }else if (weather.equals("windy")) {
            System.out.println(weather + " - get ready for power loss, fly a kite, and code java");

        }else {
            System.out.println("Just keep coding java");
        }

    }
}
