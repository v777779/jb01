package ch08.ex03.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }

    @Override
    public void show() {
        System.out.println("Circle.show");
    }
}
