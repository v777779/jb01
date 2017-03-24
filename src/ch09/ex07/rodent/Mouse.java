package ch09.ex07.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
abstract class Mouse implements Rodent{

    public Mouse() {
        System.out.print("Mouse.Constructor > ");
    }

    public void dispose() {
        System.out.println("Mouse.dispose");
    }
    @Override
    public String toString() {
        return "Beetle2{}";
    }

}
