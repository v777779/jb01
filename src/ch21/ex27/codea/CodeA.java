package ch21.ex27.codea;

import ch21.ex27.codea.car.WaxOMatic;
import ch21.ex27.codea.car2.WaxOMatic2;
import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 07-May-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nawait() and signalAll() Check\n");
        System.out.println("WaxOMatic with synchronized:");
        WaxOMatic.check();
        Time.sleep(100);
        System.out.println("\nWaxOMatic with Lock and await() signalAll():");
        WaxOMatic2.check();
        Time.sleep(100);

    }
}
