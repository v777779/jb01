package ch08.ex12.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Rodent {
    void voice() {
    }

    void eat() {
    }

    void sleep() {
    }

    void run() {
    }

    public Rodent() {
        System.out.println("Rodent.Constructor");
    }

    @Override
    public String toString() {
        return "Beetle2{}";
    }

    protected void dispose() {
        System.out.println("Rodent.dispose");
    }

}
