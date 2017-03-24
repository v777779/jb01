package ch11.ex01.access;

/**
 * Created by V1 on 19-Feb-17.
 */
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public int hop() {
        System.out.println("Gerbil.hop."+gerbilNumber);
        return gerbilNumber;
    }

    @Override
    public String toString() {
        return String.format("Gerbil{%2d}",gerbilNumber);
    }
}
