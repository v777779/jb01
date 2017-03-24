package ch11.ex31.access;

import lib.shapes.Shape;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise   Check\n");
        RandShapeGen randShapeGen = new RandShapeGen(12);
        for (Shape shape : randShapeGen) {
            System.out.println(shape);
        }
    }
}
