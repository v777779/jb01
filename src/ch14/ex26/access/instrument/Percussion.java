package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Percussion extends Instrument {
    static class Factory implements IFactory {
        @Override
        public Percussion create() {
            return new Percussion();
        }
    }
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play." + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public String toString() {
        return "Percussion{}";
    }

    @Override
    public void adjust() {
        System.out.println("Percussion.adjust");
    }
}
