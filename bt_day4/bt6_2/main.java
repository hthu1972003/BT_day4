package opp.bt_day4.bt6_2;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>();
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4,5);
        geometricObjects.add(circle);
        geometricObjects.add(rectangle);

        for (GeometricObject h : geometricObjects){
            System.out.println(h);
        }

    }

}
