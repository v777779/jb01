package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Flute extends WoodWind {
    static class Factory implements IFactory {
        @Override
        public Flute create() {
            return new Flute();
        }
    }
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
