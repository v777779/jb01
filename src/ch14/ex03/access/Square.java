package ch14.ex03.access;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Square extends Shape {
    public Square() {
    }

    public void draw() {
        System.out.println("Draw.Square");
    }
    public void rotate() {
        System.out.println("Rotate.Square");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Square");
        super.dispose();

    }
}
