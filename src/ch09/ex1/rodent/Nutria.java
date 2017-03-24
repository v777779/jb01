package ch09.ex1.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Nutria extends Rodent {


    @Override
    protected void addRef() {

    }
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

    public Nutria() {
        System.out.println("Nutria.Constructor");
    }

    @Override
    protected void dispose() {
        System.out.println("Nutria.dispose");
        super.dispose();
    }
}
