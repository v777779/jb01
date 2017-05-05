package ch21.ex21.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 04-May-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nMutex Block Check\n");
        System.out.println("MultiLock of Mutex by Same Task");
        MultiLock.check();

        Time.sleep(100);


        System.out.println("\nInterrupting of Blocked Mutex");
        Interrupting2.check();
    }
}
