package ch21.ex32.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 08-May-17.
 */
public class CodeA {
    public static void main(String[] args) {
        app();
    }

    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nCountDownLatch Check\n");

        CountDownLatchDemo.check();
        Time.sleep(1000);
    }
}
