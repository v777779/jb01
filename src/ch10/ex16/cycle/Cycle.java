package ch10.ex16.cycle;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Cycle {
    public static void buildCycle(IFactoryCycle factory) {
        ICycle c = factory.getCycle(); // получить велосипед
        c.ride();
        c.balance();
        c.wheels();
        System.out.println();
    }

    public static void buildCycle(ICycle c) {
        c.ride();
        c.balance();
        c.wheels();
        System.out.println();
    }
}
