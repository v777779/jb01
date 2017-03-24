package ch.ex18.fabric;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Equipment implements Service {
    public Equipment() {
        System.out.println("Equipment.Constructor");
    }

    @Override
    public void startWork() {
        System.out.println("Equipment.startWork");
    }

    @Override
    public void initData() {
        System.out.println("Equipment.initData");
    }
}
