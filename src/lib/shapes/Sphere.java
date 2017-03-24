package lib.shapes;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Sphere extends Shape {
    public void draw() {
        System.out.println("Sphere.draw");
    }
    public void erase() {
        System.out.println("Sphere.erase");
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}
