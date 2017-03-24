package ch14.ex04.access.shapes;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Shape {
    public Shape() {
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


}
