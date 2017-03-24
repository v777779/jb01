package ch08.ex05.access;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Bicycle extends Cycle {
    public void ride() {
        wheels();
        System.out.println("Bicycle.ride");
    }

    @Override
    public void wheels() {
        System.out.print("Two wheels.");
    }
}
