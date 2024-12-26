package models;

public interface Shape extends Printable {
    double perimeter();

    double area();

    default void print() {
        System.out.println(this);
        System.out.println("perimeter: " + perimeter());
        System.out.println("area: " + area());
    }
}
