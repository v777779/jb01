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

        System.out.println("Volatile Test:");
        SeralNumberChecker.check();
        Time.sleep(150);
    }
}
