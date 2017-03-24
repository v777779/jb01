package ch.ex4;

/**
 * Created by V1 on 11-Feb-17.
 */
public class Tool extends Stone {
    public Tool() {
        System.out.println("Tool.Constructor");
    }

    @Override
    void getBase2(Stone stone) {
        System.out.println("Tool.getBase2 > " + stone);
    }

    @Override
    public String toString() {
        return "Tool{}";
    }
}
