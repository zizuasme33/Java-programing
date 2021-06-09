package OfficeHoursday1.Practice_day_33_Tue_June8;

public class Rectangle extends Shape{

    double length;
    double width;

    @Override
    public void calculateArea() {
       area = length * width;
    }

    @Override
    public void calculatePerimeter() {
       perimeter = 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
