package day45_oop;

public class TrafficLight {

    String color;
    // this is ready only method, displays value of color variable
    public void showColor(){
        System.out.println("current color = " + color);
    }
    // this method updates the value of color variables
    public void changeColor(String newColor) {
        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") ||
                newColor.equalsIgnoreCase("green")) {
            System.out.println("changing color to = " + newColor);
            color = newColor;

        }else{
            System.out.println("ERROR: invalid color : " + newColor);
        }
    }

}
