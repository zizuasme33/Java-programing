package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {


        int count = 3; //scan.nextInt();
        System.out.println("count = " + count);
        //add / increase 2 more to count
        count = count + 2;
        System.out.println("count = " + count);
        
        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);
        
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //get another whole pizza just for you - 6 slices
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 10;
        System.out.println("players = " + players);
        // double the players to start the match
        players = players * 2;
        System.out.println("players = " + players);
        
        int cents = 568;
        System.out.println("cents = " + cents);
        // keep all dollar portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);



    }

}
