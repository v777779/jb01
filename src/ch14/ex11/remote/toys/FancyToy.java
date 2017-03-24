package ch14.ex11.remote.toys;

/**
 * Created by V1 on 08-Mar-17.
 */
public class FancyToy extends Toy implements HasBattery, WaterProof, Shoots, OnTable {
    public FancyToy() {
        super(1);
    }

    public void draw() {
        System.out.println("FancyToy");
    }

    static {
        System.out.println("Load: FancyToy");
    }

    @Override
    public String toString() {
        return "FancyToy";
    }

}
