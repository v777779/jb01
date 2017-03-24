package ch08.ex18.access;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Cycle {
   public void ride() {
        wheels();
        System.out.println("Cycle.ride");
    }
    public void wheels() {

    }

    public void balance() {
        System.out.println("Cycle.balance");
    }

}
