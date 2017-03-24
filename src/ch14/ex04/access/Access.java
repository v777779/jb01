package ch14.ex04.access;


import ch14.ex04.access.shapes.*;


/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 4 Class Upcast DownCast Check\n");

        Shape shape = new Rhomb();      // upcast Rhomb to Shape

        Rhomb rhomb = null;
        Circle circle = null;
        if (shape instanceof Rhomb) {
            rhomb = (Rhomb) shape;     // downcast Shape(Rhomb) to Rhomb
        } else {
            System.out.println("shape is not Rhomb");

        }

        if (shape instanceof Circle) {
            circle = (Circle) shape;  // downcast Shape(Rhomb) to Circle
        } else {
            System.out.println("shape is not Circle");

        }

        if (rhomb != null) {
            rhomb.draw();
        }
        if (circle != null) {
            circle.draw();
        }


    }
}
