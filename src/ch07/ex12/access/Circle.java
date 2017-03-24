package ch07.ex12.access;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Circle extends Shape {

    public Circle(int i) {
        super(i);
        System.out.println("Circle.Constructor");
    }
    void dispose() {
        System.out.println("Circle.dispose");
        super.dispose();
    }
}
