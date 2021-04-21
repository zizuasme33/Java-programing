package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {

        boolean isHungry = true;
        int banana = 0;
        int countFull = 3;

        while (isHungry) {
            // while (isHungry && banana != countFull) we can even use
            banana++;
            System.out.println("Eating a banana: \uD83C\uDF4C " + banana);

          // isHungry = banana == countFull ? false : true; ( we can even use this one)

            if (banana == countFull) {
                isHungry = false;
            }

        }
        System.out.println("Had enough bananas. let's get back to studying");

    }
}
