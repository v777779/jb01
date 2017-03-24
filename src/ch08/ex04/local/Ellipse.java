package ch08.ex04.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ellipse extends Shape {
    @Override
    public void draw() {
        System.out.println("Ellipse.draw");
    }
    @Override
    public void erase() {
        System.out.println("Ellipse.erase");
    }

    @Override
    public void show() {
        System.out.println("Ellipse.show");
    }
}
