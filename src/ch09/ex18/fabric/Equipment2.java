package ch09.ex18.fabric;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Equipment2 implements Service {
    public Equipment2() {
        System.out.println("Equipment2.Constructor");
    }

    @Override
    public void startWork() {
        System.out.println("Equipment2.startWork");
    }

    @Override
    public void initData() {
        System.out.println("Equipment2.initData");
    }
}
