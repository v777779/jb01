package ch08.ex09.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Nutria extends Rodent {
    @Override
    void voice() {
        System.out.println("Nutria.voice");
    }

    @Override
    void eat() {
        System.out.println("Nutria.eat");
    }

    @Override
    void sleep() {
        System.out.println("Nutria.sleep");
    }

    @Override
    void run() {
        System.out.println("Nutria.run");
    }

    @Override
    public String toString() {
        return "Nutria{}";
    }
}
