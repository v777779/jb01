package ch14.ex20.access.shop;

/**
 * Created by V1 on 08-Mar-17.
 */
public class FancyToy extends Toy implements HasBattery, WaterProof, Shoots, OnTable {
    public FancyToy(){
        super();
    }


    public FancyToy(int i) {
        super(i);
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
