package ch08.ex09.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Hamster extends Rodent {
    @Override
    void voice() {
        System.out.println("Hamster.voice");
    }

    @Override
    void eat() {
        System.out.println("Hamster.eat");
    }

    @Override
    void sleep() {
        System.out.println("Hamster.sleep");
    }

    @Override
    void run() {
        System.out.println("Hamster.run");
    }

    @Override
    public String toString() {
        return "Hamster{}";
    }
}
