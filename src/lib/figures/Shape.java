package lib.figures;

import lib.utils.IFactory;
import lib.utils.Range;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Shape {
    private static List<IFactory<?extends Shape>> list = new ArrayList<>(); // IFactory2 <T> >>  T create();

    public Shape() {
    }

    static {
        list.add(new Circle.Factory());
        list.add(new Cube.Factory());
        list.add(new Line.Factory());
        list.add(new Point.Factory());
        list.add(new Rectangle.Factory());
        list.add(new Rhomb.Factory());
        list.add(new Square.Factory());
        list.add(new Triangle.Factory());
    }

    public void draw() {
        System.out.println("Shape.Draw");
    }

    public void rotate() {

    }

    public void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Circle is not rotated");
        } else {
            shape.rotate();
        }
    }

    void dispose() {
        System.out.println("Shape.Close");
    }

    public static Shape randomShape() {
        return list.get(Range.getInt(list.size())).create();
    }

    @Override
    public String toString() {
        return "Shape."+getClass().getSimpleName();
    }
}
