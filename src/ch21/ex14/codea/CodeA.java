package ch21.ex14.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 01-May-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nAtomic Class Check\n");

        System.out.println("AtomicIntegerTest:");
        AtomicIntegerTest.check();
        Time.sleep(500);

        System.out.println("\nAtomicEvenGenerator Test:");
        AtomicEvenGenerator.check();
        Time.sleep(1500);

    }
}
