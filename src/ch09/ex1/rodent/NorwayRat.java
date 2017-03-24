package ch.ex1.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class NorwayRat extends Rat {
    private boolean checkFinal = false;
    private int refCount = 0;

    public NorwayRat() {
        System.out.println("NorwayRat.Constructor");
    }

    @Override
    protected void dispose() {
        if (--refCount == 0) {
            System.out.println("NorwayRat.dispose");
            super.dispose();
        }
    }

    @Override
    protected void addRef() {
        refCount++;
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
