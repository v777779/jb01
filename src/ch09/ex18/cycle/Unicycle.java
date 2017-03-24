package ch.ex18.cycle;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Unicycle implements Cycle {
    @Override
    public void ride() {
      System.out.println("Unicycle.ride");
    }

    @Override
    public void wheels() {
        System.out.println("Unicycle.wheels");
    }

    @Override
    public void balance() {
        System.out.println("Unicycle.balance");
    }
}
