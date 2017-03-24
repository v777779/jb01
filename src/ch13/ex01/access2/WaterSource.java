package ch13.ex01.access2;

/**
 * Created by V1 on 04-Mar-17.
 */
public class WaterSource {
    String s;
    public WaterSource() {
        s = "made";
    }

    @Override
    public String toString() {
        return "WaterSource."+s;
    }
}
