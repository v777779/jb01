package ch15.ex40.integra;

import lib.utils.SimpleQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nLatent w Reflections Applied to Sequence Check\n");

        try {

            System.out.println("List of Shape:");
            List<Shape> shapes = new ArrayList<>(); // List базового класса
            for (int i = 0; i < 5; i++) {
                    shapes.add(new Shape()); // просто заполнили базовым классом
            }
            shapes.add(new Square()); // просто заполнили базовым классом
            shapes.add(new Square()); // просто заполнили базовым классом

            Apply.apply(shapes, Shape.class.getMethod("rotate"));
            Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5); // применить ко всем экземплярам


            System.out.println("\nList of Square:");
            List<Square> squares = new ArrayList<>(); // List базового класса
            for (int i = 0; i < 5; i++) {
                squares.add(new Square()); // просто заполнили базовым классом
            }

            Apply.apply(squares, Square.class.getMethod("rotate"));
            Apply.apply(squares, Square.class.getMethod("resize", int.class), 5); // применить ко всем экземплярам

            System.out.println("\nQueue of Shape:");
            Queue<Shape> q = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                q.add(new Shape());
                q.add(new Square());
            }

            Apply.apply(q,Shape.class.getMethod("resize", int.class), 1);

            System.out.println("\nSimpleQueue of Shape:");
            SimpleQueue<Shape> sq = new SimpleQueue<>();
            for (int i = 0; i < 5; i++) {
                sq.add(new Shape());
                sq.add(new Square());
            }

            Apply.apply(sq,Shape.class.getMethod("rotate"));


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
}
