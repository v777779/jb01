package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Stringed extends Instrument {
    static class Factory implements IFactory {
        @Override
        public Stringed create() {
            return new Stringed();
        }
    }
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play." + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println("Stringed.adjust");
    }

    @Override
    public String toString() {
        return "Stringed{}";
    }
}
