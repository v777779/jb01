package ch21.ex40.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 14-May-17.
 */
public class CodeA {
    public static void main(String[] args) {
        app();
    }
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nReaderWriterLock Check\n");

        ReaderWriterListTest.check();
        Time.sleep(2500);
    }
}
