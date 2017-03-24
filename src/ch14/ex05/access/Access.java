package ch14.ex05.access;

import ch14.ex05.access.shapes.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void rotateAll(List<Shape> list) {
        for (Shape shape : list) {
            if (shape instanceof Circle) {
                System.out.println("Circle is not rotated");
            } else {
                shape.rotate();
            }

        }

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 5 instanceOf Check\n");
        List<Shape> list = Arrays.asList(
                new Circle(), new Square(),
                new Triangle(), new Rhomb()
        );
        for (Shape shape : list) {
            shape.draw();
            shape.rotate(shape);
        }
        System.out.println("\nRotation Type 2:");
        rotateAll(list);


    }
}
