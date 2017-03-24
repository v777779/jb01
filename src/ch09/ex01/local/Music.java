package ch09.ex01.local;

/**
 * Created by V1 on 11-Feb-17.
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            instrument.play(Note.MIDDLE_C);

        }
    }

}
