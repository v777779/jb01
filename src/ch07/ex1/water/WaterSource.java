package ch07.ex1.water;

/**
 * Created by V1 on 07-Feb-17.
 */
public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "made";
    }

    @Override
    public String toString() {
        return (s);
    }
}
