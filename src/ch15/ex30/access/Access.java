package ch15.ex30.access;

import lib.utils.Holder;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    private static <T> void checkType(Holder<T> h, T value) {
        System.out.println("\nHolder <"+ h.getName()+">:");
        System.out.println("Holder :"+h.getValue());
        h.setValue(value);
        System.out.println("Holder :"+h.getValue());
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 30 Primitive w Generic Check\n");
        Holder<Character> hc = new Holder<>('w');
        Holder<Byte>    hb = new Holder<>((byte)1);
        Holder<Short>   hs = new Holder<>((short)120);
        Holder<Integer> hi = new Holder<>(150);
        Holder<Long>    hl = new Holder<>(1000L);
        Holder<Float>   hf = new Holder<>(1.232F);
        Holder<Double>  hd = new Holder<>(3.750);

        checkType(hc,'s');
        checkType(hb,(byte)2);
        checkType(hs,(short)240);
        checkType(hi,(300));
        checkType(hl,2000L);
        checkType(hf,2.4343F);
        checkType(hd,4.278);


    }
}
