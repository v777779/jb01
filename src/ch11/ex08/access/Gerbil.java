package ch11.ex08.access;

/**
 * Created by V1 on 19-Feb-17.
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.print(this+" ");

    }

    @Override
    public String toString() {
        return String.format("Grb{%d}",gerbilNumber);
    }
}
