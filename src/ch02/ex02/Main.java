package ch02.ex02;

/**
 * Created by V1 on 02-Feb-17.
 */
public class Main {

    static void doSomething(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Line();
        shapes[2] = new Square();
        shapes[3] = new Triangle();

        for (Shape shape : shapes) {
            doSomething(shape);
        }


    }
}
