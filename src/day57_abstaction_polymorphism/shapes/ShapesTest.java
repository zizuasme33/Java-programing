package day57_abstaction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {

    public static void main(String[] args) {
        // one variable and different objects
        Shape triangle = new Triangle();
        triangle.draw();

        /**
         * single variable of parent type, and different objects of child types
         */
        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        /**
         * creat list of shape and store different shapes
         * using a loop and print out each shape
         */

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        shapes.add(new Square());
        shapes.add(new Circle());
        shapes.add(new Circle());

       // System.out.println(shapes); prints Hashcodes of objects

        for (Shape eachShape : shapes) {
            eachShape.draw();

        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(triangle);

    }

    /**
     * static method: draw shape
     * accepts object of shape
     * then calls draw method
     */

    public static void drawShape(Shape shape){
        System.out.println("----Drawing shape----");
        shape.draw();
    }




}
