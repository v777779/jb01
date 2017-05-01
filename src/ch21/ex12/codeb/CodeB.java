package ch21.ex12.codeb;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 01-May-17.
 */
public class CodeB {
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nAtomic and Volatile Check\n");
        System.out.println("Atomicity Test:");
        AtomicityTest.check();
        Time.sleep(1500);

        System.out.println("\nVolatile Test:");
        SeralNumberChecker.check();
        Time.sleep(150);
    }
}
