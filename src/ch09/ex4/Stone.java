package ch.ex4;

/**
 * Created by V1 on 11-Feb-17.
 */
abstract public class Stone {

    public Stone() {
        System.out.println("Stone.Constructor");
    }

    static void getBase(Stone stone) {
        System.out.println("Stone.getBase static > " + stone);
    }
    abstract void getBase2(Stone stone);

    @Override
    public String toString() {
        return "Stone{}";
    }
}
