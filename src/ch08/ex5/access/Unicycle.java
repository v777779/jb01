package ch08.ex5.access;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Unicycle extends Cycle {
    @Override
    public void ride() {
        wheels();
        System.out.println("Unicycle.ride");
    }

    @Override
    public void wheels() {
        System.out.print("One wheel.");
    }
}
