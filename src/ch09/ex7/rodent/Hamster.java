package ch.ex7.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Hamster implements Rodent {
    public Hamster() {
        System.out.println("Hamster.Constructor");
    }

    @Override
    public void addRef() {
    }
    @Override
    public void dispose() {
        System.out.println("Hamster.dispose");
    }


    @Override
    public void voice() {
        System.out.println("Hamster.voice");
    }

    @Override
    public void eat() {
        System.out.println("Hamster.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster.sleep");
    }

    @Override
    public void run() {
        System.out.println("Hamster.run");
    }

    @Override
    public String toString() {
        return "Hamster{}";
    }

}
