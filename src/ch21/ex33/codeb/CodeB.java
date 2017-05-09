package ch21.ex33.codeb;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 08-May-17.
 */
public class CodeB {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_B===");
        System.out.println("\nDelayedQueue Check\n");
        DelayQueueDemo.check();
        Time.sleep(2100);
    }
}
