package ch09.ex01.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
 public abstract class Rodent {
    abstract void voice();

    abstract void eat();

    abstract void sleep();

    abstract void run();

    abstract protected void addRef();   // если не реализован, то ничего не делает в потомках


    public Rodent() {
        System.out.println("\nRodent.Constructor");
    }

    @Override
    public String toString() {
        return "Rodent{}";
    }

    protected void dispose() {
        System.out.println("Rodent.dispose");
    }

}
