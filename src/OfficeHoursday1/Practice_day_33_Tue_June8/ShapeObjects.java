package OfficeHoursday1.Practice_day_33_Tue_June8;

public class ShapeObjects {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.calculateArea();

        Square squareOne = new Square();
        squareOne.side = 5;
        squareOne.calculateArea();
        squareOne.calculatePerimeter();
        System.out.println(squareOne);

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 3;
        rectangle1.length =4;
        rectangle1.calculateArea();;
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);

        Circle circle1 = new Circle();
        circle1.radius = 10;
        circle1.calculateArea();
        circle1.calculatePerimeter();
        System.out.println(circle1);


    }
}
