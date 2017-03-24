package ch08.ex04.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Point extends Shape {
    @Override
    public void draw() {
        System.out.println("Point.draw");
    }

    @Override
    public void show() {
        System.out.println("Point.show");
    }

    @Override
    public void erase() {
        System.out.println("Point.erase");
    }
}
