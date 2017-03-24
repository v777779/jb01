package ch14.ex03.access;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Triangle extends Shape {
    public Triangle() {
    }

    public void draw() {
        System.out.println("Draw.Triangle");
    }
    public void rotate() {
          System.out.println("Rotate.Triangle");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Triangle");
        super.dispose();

    }
}
