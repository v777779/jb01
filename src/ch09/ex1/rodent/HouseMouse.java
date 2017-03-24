package ch.ex1.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class HouseMouse extends Mouse {
    public HouseMouse() {
        System.out.println("HouseMouse.Constructor");
    }

    @Override
    protected void dispose() {
        System.out.println("HouseMouse.dispose");
        super.dispose();
    }

    @Override
    protected void addRef() {

    }

    @Override
    void voice() {
        System.out.println("HouseMouse.voice");
    }

    @Override
    void eat() {
        System.out.println("HouseMouse.eat");
    }

    @Override
    void sleep() {
        System.out.println("HouseMouse.sleep");
    }

    @Override
    void run() {
        System.out.println("HouseMouse.run");
    }

    @Override
    public String toString() {
        return "HouseMouse{}";
    }

 }
