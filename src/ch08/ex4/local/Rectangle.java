package ch08.ex4.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }

    @Override
    public void show() {
        System.out.println("Rectangle.show");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase");
    }
}
