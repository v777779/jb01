package ch08.ex4.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Hexagon extends Shape {
    @Override
    public void draw() {
        System.out.println("Hexagon.draw");
    }

    @Override
    public void show() {
        System.out.println("Hexagon.show");
    }

    @Override
    public void erase() {
        System.out.println("Hexagon.erase");
    }
}
