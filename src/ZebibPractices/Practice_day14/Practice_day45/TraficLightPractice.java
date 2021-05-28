package ZebibPractices.Practice_day14.Practice_day45;

public class TraficLightPractice {
    String color;


    public void showColor(){
        System.out.println("current color = " + color);
    }
    public void changeColor(String newColor) {
        if (newColor.equalsIgnoreCase("green") || newColor.equalsIgnoreCase("red")) {
        System.out.println("changing color to " + newColor);
        color = newColor;

    }else {
            System.out.println("Error");
            color = newColor;
        }
    }

    public static void main(String[] args) {

        TraficLightPractice test = new TraficLightPractice();
        test.changeColor("blue");
        test.showColor();

    }

}
