import models.*;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        Shape t = new Triangle(3, 4, 5);
        Shape r = new Rectangle(5, 7);
        Circle c = new Circle(7);
        Square s = new Square(8);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(t);
        shapes.add(r);
        shapes.add(c);
        shapes.add(s);

        for (Shape shape : shapes) {
            System.out.println("++++++++++++++");
            printData(shape);
        }
    }

    // Code in general rather than in specific
    public static void printData(Printable obj) {
        obj.print();
    }
}
