package ch14.ex26.access;

import ch14.ex26.access.instrument.Instrument;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 26 RTTI Methodology Check\n");

        for (Instrument instrument : Instrument.getList(25)) {
            System.out.printf("%-12s  :  ",instrument);
            instrument.prepareInstrument();
        }
    }
}
