package ch21.ex17.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 03-May-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nLocal Thread Memory Check\n");
        ThreadLocalVariableHolder.check();

        Time.sleep(50);
        System.out.println("\nThreadLocal w Interrupt shutdownNow():");
        ThreadLVHInterrupt.check();

        Time.sleep(50);
        System.out.println("\nThreadLocal w Interrupt cancel():");
        ThreadLVHInterrupt.checkWithInterrupt();
        Time.sleep(150);
    }
}
