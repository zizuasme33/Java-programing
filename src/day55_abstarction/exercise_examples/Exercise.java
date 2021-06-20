package day55_abstarction.exercise_examples;

public abstract class Exercise {

    public void start() { // non abstract method
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * - abstract method - method without body, just signature
     * - purpose: letting sub classes implement/override their own way
     */
    public abstract void perform();

    /**
     * another abstract method that concrete sub classes will override/implement
     * @param minutes - how long is exercise is performed
     * @return number iof calories burned/use
     */
    public abstract int getCaloriesCount(int minutes);

}
