package ch.ex1.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
abstract public class Rat extends Rodent {
    public Rat() {
        System.out.println("Rat.Constructor");
    }

    @Override
    public String toString() {
        return "Rat{}";
    }

    @Override
    protected void dispose() {
        System.out.println("Rat.dispose");
        super.dispose();
    }

}
