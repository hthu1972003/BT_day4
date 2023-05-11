package opp.bt_day4.bt6_2;

public class Circle implements GeometricObject {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPrimeter() {
        return 0;
    }
}
