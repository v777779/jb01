package ch09.ex10.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Music {
    public static void tune(Playable instrument) {
        instrument.play(Note.MIDDLE_C);  // настройка инструмента
    }

    public static void tuneAll(Playable[] instruments) {
        for (Playable instrument : instruments) {
            tune(instrument);
        }

    }

    public static void what (Instrument instrument) {
        System.out.println(instrument);
    }

}
