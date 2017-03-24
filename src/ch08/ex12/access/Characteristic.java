package ch08.ex12.access;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Characteristic {
    String s;

    public Characteristic(String s) {
        this.s = s;
        System.out.println("Characteristic.Constructor."+s);
    }

    protected void dispose() {
        System.out.println("Characteristic.dispose."+s);
    }

}
