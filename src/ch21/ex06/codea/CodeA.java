package ch21.ex06.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 28-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nTimeUnit Sleep Check\n");
        SleepingTask.check();

        Time.sleep(100);
    }
}
