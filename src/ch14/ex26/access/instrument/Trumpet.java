package ch14.ex26.access.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Trumpet extends Brass{
    static class Factory implements IFactory {
        @Override
        public Trumpet create() {
            return new Trumpet();
        }
    }
    @Override
    public void play(Note note) {
        System.out.println("Trumpet.play." + note);
    }

    @Override
    public String what() {
        return"Trumpet";
    }

    @Override
    public String toString() {
        return "Trumpet{}";
    }
}
