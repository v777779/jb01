package ch14.ex20.access.shop;

/**
 * Created by V1 on 11-Mar-17.
 */
public class ExtToy extends Toy implements HasBattery, WaterProof  {

    public ExtToy() {
    }

    public ExtToy(int i) {
        this.i = i;
    }

    public void show() {
        System.out.println("ExtToy.show."+i);
    }

    public void list() {
        System.out.println("ExtToy.list");
    }

    @Override
    public String toString() {
        return "ExtToy is Super Parent Class " +super.toString();
    }
}
