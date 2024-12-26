package models;

public interface Shape extends Printable {
    double perimeter();

    double area();

    default void print() {
        System.out.println("A shape with type: " + getClass().getName());
        System.out.println("perimeter: " + perimeter());
        System.out.println("area: " + area());
    }
}
