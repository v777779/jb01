package ch11.ex10.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Mouse extends Rodent {

    public Mouse() {

    }

    @Override
    protected void dispose() {
        System.out.println("Mouse.dispose");
        super.dispose();
    }

    @Override
    public String toString() {
        return "Mouse{}";
    }

}
