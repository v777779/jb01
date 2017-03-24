package ch14.ex06.access;

import ch14.ex06.access.shapes.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 6 Select Class Check\n");

        List<Shape> list = Arrays.asList(
                new Circle(), new Square(),
                new Triangle(), new Rhomb()
        );
        for (Shape shape : list) {
            shape.draw();
        }

        Shape.select(Circle.class);  // выбрали нужный класс

        for (Shape shape : list) {
            System.out.println(shape);
        }


    }
}
