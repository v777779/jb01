package ch14.ex26.access.instrument;

import lib.utils.Range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Instrument {
    private static List<IFactory> listType = new ArrayList<>();
    private static List<Class<? extends Instrument>> types = Arrays.asList(
            Brass.class, WoodWind.class, Percussion.class,
            Stringed.class, Flute.class, Trumpet.class, Violin.class
    );
    static {
        listType.add(new Brass.Factory());
        listType.add(new WoodWind.Factory());
        listType.add(new Percussion.Factory());
        listType.add(new Stringed.Factory());
        listType.add(new Flute.Factory());
        listType.add(new Trumpet.Factory());
        listType.add(new Violin.Factory());
    }

    public void play(Note note) {
        System.out.println("Instrument.play." + note);
    }

    public String what() {
        return toString();
    }

    public void adjust() {
        System.out.println("Instrument.adjust");
    }

    public void prepareInstrument() {
        System.out.println("Instrument.prepareInstrument");
    }

    public static ArrayList<Instrument> getList(int size) {
        ArrayList<Instrument> list = new ArrayList<>();
        try {
            for (int i = 0; i < size; i++) {
                list.add(types.get(Range.getInt(types.size())).newInstance());  // динамическое программирвоание
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return  list;
    }

    @Override
    public String toString() {
        return "Instrument{}";
    }

}
