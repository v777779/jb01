package ch21.ex10.codea;

import lib.utils.Time;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 29-Apr-17.
 */
public class CodeA {
    public static void app() {
        System.out.println("\n====CODE_A===");
        System.out.println("\nDirect Inheritance from Thread Check\n");
        System.out.println("Thread Based Realization:");
        SimpleThread.check();
        Time.sleep(100);

        System.out.println("\nRunnable Based Realization:");
        SelfManaged.check();
        Time.sleep(100);


        System.out.println("\nInner Classes and Anonymous Classes Reralization:");
        ThreadVariations.check();
        Time.sleep(100);

    }
}
