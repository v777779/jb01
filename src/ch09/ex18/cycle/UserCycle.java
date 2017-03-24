package ch09.ex18.cycle;

/**
 * Created by V1 on 14-Feb-17.
 */
public class UserCycle {
    public static void buildCycle(IFactoryCycle factoryCycle) {
        Cycle c = factoryCycle.getCycle(); // получить велосипед
        c.ride();
        c.balance();
        c.wheels();
    }
}
