package ch08.ex15.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Rodent {
    void voice() {
    }

    void eat() {
    }

    void sleep() {
    }

    void run() {
    }

    protected void addRef() {   // если не реализован, то ничего не делает в потомках
    }

    public Rodent() {
        System.out.println("\nRodent.Constructor");
    }

    public Rodent(FieldMouse fieldMouse) {
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
