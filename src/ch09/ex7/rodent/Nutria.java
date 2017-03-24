package ch09.ex7.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Nutria extends Rat implements Rodent {

    public Nutria() {
        System.out.println("Nutria.Constructor");
    }
    @Override
    public  void dispose() {
        System.out.println("Nutria.dispose");
        super.dispose();
    }

    @Override
    public void addRef() {

    }
    @Override
    public void voice() {
        System.out.println("Nutria.voice");
    }

    @Override
    public void eat() {
        System.out.println("Nutria.eat");
    }

    @Override
    public void sleep() {
        System.out.println("Nutria.sleep");
    }

    @Override
    public void run() {
        System.out.println("Nutria.run");
    }


    @Override
    public String toString() {
        return "Nutria{}";
    }


}
