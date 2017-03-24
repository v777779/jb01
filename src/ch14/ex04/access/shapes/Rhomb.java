package ch14.ex04.access.shapes;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Rhomb extends Shape {
    public Rhomb() {
    }

    public void draw() {
        System.out.println("Draw.Rhomb");
    }
    public void rotate() {
        System.out.println("Rotate.Rhomb");
    }

    @Override
    void dispose() {
        System.out.println("Erase.Rhomb");
        super.dispose();

    }
}
