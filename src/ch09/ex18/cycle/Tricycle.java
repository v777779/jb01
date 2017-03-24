package ch.ex18.cycle;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Tricycle implements Cycle {
    @Override
    public void balance() {
        System.out.println("Tricycle.balance");
    }

    public void ride() {
        System.out.println("Tricycle.ride");
    }

    @Override
    public void wheels() {
        System.out.println("Tricycle.wheels");
    }
}
