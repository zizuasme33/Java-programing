package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //creat traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; (NOT THIS WAY to do Today)
        // we will assign/ update the value of color using a method of class
        trafficLight.changeColor("red");
       // System.out.println("current color = " + trafficLight.color); DIRECT access to variable. NOT recommended
        // call method to access ht variable
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();

    }
}
