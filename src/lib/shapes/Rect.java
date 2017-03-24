package lib.shapes;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Rect extends Shape{
    public void draw() {
        System.out.println("Rectangle.draw");
    }

    public void erase() {
        System.out.println("Rectangle.erase");
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
