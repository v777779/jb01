package ch14.ex01.local;

/**
 * Created by V1 on 28-Feb-17.
 */
abstract public class Shape {
    public void draw() {
        System.out.println(this+".draw()");
    }
    abstract public String toString();

}
