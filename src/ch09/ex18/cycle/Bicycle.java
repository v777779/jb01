package ch09.ex18.cycle;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Bicycle implements Cycle {
    public void ride() {
        System.out.println("Bicycle.ride");
    }

    @Override
    public void wheels() {
        System.out.println("Bicycle.wheels");
    }

    @Override
    public void balance() {
        System.out.println("Bicycle.balance");
    }
}
