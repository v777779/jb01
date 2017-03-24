package ch11.ex10.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class NorwayRat extends Rat {

    public NorwayRat() {
    }

    @Override
    protected void dispose() {
        super.dispose();
    }

    @Override
    void voice() {
        System.out.println("NorwayRat.voice");
    }

    @Override
    void eat() {
        System.out.println("NorwayRat.eat");
    }

    @Override
    void sleep() {
        System.out.println("NorwayRat.sleep");
    }

    @Override
    void run() {
        System.out.println("NorwayRat.run");
    }

    @Override
    public String toString() {
        return "NorwayRat{}";
    }



}
