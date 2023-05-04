package opp.b1_2;

public class TestMain {

        public static void main(String[] args) {
            Circle circle1 = new Circle(1.1);
            System.out.println(circle1);

            Circle circle2 = new Circle(1.0);
            System.out.println(circle2);

            Circle circle3 = new Circle(2.2);
            System.out.println(circle3);

            System.out.println("radius is: " + circle3.getRadius());
            System.out.println("area is: " + circle3.getArea());
            System.out.println("circumference is: " + circle3.getCircumference());
        }
    }

