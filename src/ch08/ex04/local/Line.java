package ch08.ex04.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line.draw");
    }

    @Override
    public void show() {
        System.out.println("Line.show");
    }

    @Override
    public void erase() {
        System.out.println("Line.erase");
    }
}
