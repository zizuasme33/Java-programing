package OfficeHoursday1.Practice_day_33_Tue_June8;

public class Square extends Shape {

    double side;

    @Override
    public void calculateArea() {
       area = side  * side;
    }

    @Override
    public void calculatePerimeter() {
       perimeter = side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
