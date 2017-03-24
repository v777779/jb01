package ch08.ex2.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }
}
