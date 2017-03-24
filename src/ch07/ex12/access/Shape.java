package ch07.ex12.access;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Shape {

    public Shape(int i) {
        System.out.println("Shape.Contructor .. parent");
    }
    void dispose() {
        System.out.println("Shape.dispose .. parent");
    }
}
