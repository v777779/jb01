package ch08.ex17.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Rodent {
    public Rodent() {
        System.out.println("Rodent.Rodent");
    }

    public Wood getMaterial() {
        return new Wood();
    }


}
