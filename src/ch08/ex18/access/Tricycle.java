package ch08.ex18.access;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Tricycle extends Cycle {
    public void ride() {
        wheels();
        System.out.println("Tricycle.ride");
    }

    @Override
    public void wheels() {
        System.out.print("Three wheels.");
    }
}
