package ch15.ex40.integra;

/**
 * Created by V1 on 22.03.2017.
 */
public class Shape {
    public void rotate() {
        System.out.println(this+" rotate");
    }

    public void resize(int size) {
        System.out.println(this+" resize " + size);
    }

    @Override
    public String toString() {
        return "Shape{}";
    }
}
