package OfficeHoursday1.Practice_day_33_Tue_June8;

/*
        1. Create a class called Shape
        - variables: area, perimeter
        - methods: calculateArea(), calculatePerimeter()

        2. Create sub classes of Shape: Circle, Rectangle, Square
        - give the instance variables that are needed to calculate the Area, perimeter, of those shape
 */

public class Shape {

    double area;
    double perimeter;

    public void calculateArea() {
        System.out.println("Shape area");
    }

    public void calculatePerimeter() {
        System.out.println("Shape perimeter");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
