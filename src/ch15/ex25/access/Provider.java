package ch15.ex25.access;

/**
 * Created by V1 on 20.03.2017.
 */
public class Provider implements IWater,IGas {
    @Override
    public void gas() {
        System.out.println("Provider.gas");
    }

    @Override
    public void water() {
        System.out.println("Provider.water");
    }
}
