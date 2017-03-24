package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);  // настройка инструмента
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }

    }

    public static void what (Instrument instrument) {
        System.out.println(instrument);
    }

}
