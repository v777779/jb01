package ch07.ex12a.access;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Plate extends Utensil {
    public void calc(double d) {
        System.out.println("Plate.calc: "+d);

    }
    public void calc(long l) {
        System.out.println("Plate.calc: "+l);

    }
}
