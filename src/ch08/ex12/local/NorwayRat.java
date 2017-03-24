package ch08.ex12.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class NorwayRat extends Rat {
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


    public NorwayRat() {
        System.out.println("NorwayRat.Constructor");
    }

    @Override
    protected void dispose() {
        System.out.println("NorwayRat.dispose");
        super.dispose();
    }

}
