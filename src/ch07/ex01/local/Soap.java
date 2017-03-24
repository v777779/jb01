package ch07.ex01.local;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Soap {
    private String s;

    public Soap() {
        System.out.println("Soap()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return  s;
    }
}
