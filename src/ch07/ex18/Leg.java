package ch07.ex18;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Leg {
    int i;
    public Leg(int i) {
        this.i = i;
        System.out.println("Leg.Number: "+i);
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}
