package ch07.ex12.access;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Triangle extends Shape {
    public Triangle(int i) {
        super(i);
        System.out.println("Triangle.Constructor");
    }
    void dispose() {
        System.out.println("Triangle.dispose");
        super.dispose();
    }
}
