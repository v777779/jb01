package lib.shapes;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Pyramid extends Shape {
    public void draw() {
        System.out.println("Pyramid.draw");
    }
    public void erase() {
        System.out.println("Pyramid.erase");
    }

    @Override
    public String toString() {
        return "Pyramid";
    }
}
