package ch08.ex12.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Mouse extends Rodent {

    @Override
    public String toString() {
        return "Beetle2{}";
    }

    public Mouse() {
        System.out.println("Mouse.Constructor");
    }

    @Override
    protected void dispose() {
        System.out.println("Mouse.dispose");
        super.dispose();
    }
}
