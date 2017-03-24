package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Violin extends Stringed{
    static class Factory implements IFactory <Instrument> {
        @Override
        public Violin create() {
            return new Violin();
        }
    }
    @Override
    public void play(Note note) {
        System.out.println("Violin.play." + note);
    }

    @Override
    public String what() {
        return "Violin";
    }

    @Override
    public void adjust() {
        System.out.println("Violin.adjust");
    }

    @Override
    public String toString() {
        return "Violin{}";
    }
}
