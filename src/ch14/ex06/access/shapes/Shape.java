package ch14.ex06.access.shapes;

/**
 * Created by V1 on 28-Feb-17.
 */
public class Shape {
    protected static Class cClass;

    public Shape() {
    }

    public void draw() {
        System.out.println("Shape.Draw");
    }
    public void rotate() {

    }

    public static void select (Class cSet) {
        cClass = cSet;
    }

    protected boolean isSelected() {
        return (this.cClass == this.getClass()) ;
    }

    public void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Circle is not rotated");
        } else {
            shape.rotate();
        }
    }

    void dispose() {
        System.out.println("Shape.Close");
    }

    @Override
    public String toString() {
        return "Shape: "+this.getClass().getSimpleName()+" selected:"+isSelected();
    }
}
