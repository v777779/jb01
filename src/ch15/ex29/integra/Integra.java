package ch15.ex29.integra;

import lib.utils.Holder;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nCapture Conversion Check\n");
        Capture c = new Capture();
        Holder hRaw = new Holder<Integer>(1); //
        c.f1(hRaw); // не выдает предупреждений работает
        c.f2(hRaw); // тоже работает

    }
}
