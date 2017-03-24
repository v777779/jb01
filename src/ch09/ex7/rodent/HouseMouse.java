package ch.ex7.rodent;

/**
 * Created by V1 on 09-Feb-17.
 */
public class HouseMouse extends Mouse implements Rodent {
    public HouseMouse() {
        System.out.println("HouseMouse.Constructor");
    }

    @Override
    public  void dispose() {
        System.out.println("HouseMouse.dispose");
        super.dispose();
    }
    @Override
    public void addRef() {

    }
    @Override
    public void voice() {
        System.out.println("HouseMouse.voice");
    }

    @Override
    public void eat() {
        System.out.println("HouseMouse.eat");
    }

    @Override
    public void sleep() {
        System.out.println("HouseMouse.sleep");
    }

    @Override
    public void run() {
        System.out.println("HouseMouse.run");
    }


    @Override
    public String toString() {
        return "HouseMouse{}";
    }

 }
