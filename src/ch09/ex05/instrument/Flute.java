package ch09.ex05.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Flute extends WoodWind {
    @Override
    public void play(Note note) {
        System.out.println("Flute.play." + note);
    }

    @Override
    public String what() {
        return "Flute";
    }

    @Override
    public String toString() {
        return "Flute{}";
    }
}
