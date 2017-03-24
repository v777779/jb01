package ch08.ex9.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class FieldMouse extends Mouse {
    @Override
    void voice() {
        System.out.println("Wing2.voice");
    }

    @Override
    void eat() {
        System.out.println("Wing2.eat");
    }

    @Override
    void sleep() {
        System.out.println("Wing2.sleep");
    }

    @Override
    void run() {
        System.out.println("Wing2.run");
    }

    @Override
    public String toString() {
        return "Wing2{}";
    }
}
