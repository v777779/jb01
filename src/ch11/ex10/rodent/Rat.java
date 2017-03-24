package ch11.ex10.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Rat extends Rodent {
    public Rat() {
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
