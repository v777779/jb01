package ch08.ex4.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase");
    }

    @Override
    public void show() {
        System.out.println("Triangle.show");
    }
}
