package ch09.ex01.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public abstract class Mouse extends Rodent {

    public Mouse() {
        System.out.println("Mouse.Constructor");
    }

    @Override
    protected void dispose() {
        System.out.println("Mouse.dispose");
        super.dispose();
    }

    @Override
    public String toString() {
        return "Beetle2{}";
    }

}
