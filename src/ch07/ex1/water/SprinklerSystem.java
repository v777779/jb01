package ch07.ex1.water;

/**
 * Created by V1 on 07-Feb-17.
 */
public class SprinklerSystem {
    private String[] valves = new String[5];
    private WaterSource waterSource = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return ("valve1 = " + valves[0] + " "+
                "valve2 = " + valves[1] + " "+
                "valve3 = " + valves[2] + " "+
                "valve4 = " + valves[3] + " "+
                "valve5 = " + valves[4] + " "+
                "\n" +
                "i = " + i + " f = " + f + " " +
                "source = " + waterSource
        );
    }
}
