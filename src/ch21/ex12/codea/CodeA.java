package ch21.ex12.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 01-May-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nLock Check\n");

        System.out.println("Lock with Even Generator:");
        MutexEvenGenerator.check();

        Time.sleep(1000);

        System.out.println("\nLock between Threads:");
        AttemptingLocking.check();

    }
}
