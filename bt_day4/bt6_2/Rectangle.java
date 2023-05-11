package opp.bt_day4.bt6_2;

public class Rectangle implements GeometricObject {

    double width;
    double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
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
