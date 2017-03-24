package ch14.ex01.access;

/**
 * Created by V1 on 08-Mar-17.
 */
public class FancyToy extends Toy implements HasBattery, WaterProof, Shoots {
    public FancyToy() {
        super(1);
    }

    static {
        System.out.println("Load: FancyToy");
    }

}
