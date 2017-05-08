package ch21.ex31.codea;

import ch21.ex31.codea.sticks.DeadLockingDiningPhilosophers;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 08-May-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nMutial Blocking Check\n");
        DeadLockingDiningPhilosophers.check();
    }
}
