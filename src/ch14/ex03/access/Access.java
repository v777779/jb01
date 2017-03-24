package ch14.ex03.access;

import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 3 Class Check\n");
        List<Shape> list = Arrays.asList(
                new Circle(), new Square(),
                new Triangle(), new Rhomb()
        );
        for (Shape shape : list) {
            shape.draw();
        }

        try {

        Shape shape = new Rhomb();      // upcast Rhomb to Shape
        Rhomb rhomb = (Rhomb)shape;     // downcast Shape(Rhomb) to Rhomb
        Circle circle = null;  // downcast Shape(Rhomb) to Circle
            circle = (Circle)shape;
            rhomb.draw();
            circle.draw();

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("catch: "+e.getMessage().replaceAll("(\\w+\\.)*",""));
        }




    }
}
