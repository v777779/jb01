package ch.ex10.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Vilolin extends Stringed {
    @Override
    public void play(Note note) {
        System.out.println("Vilolin.play." + note);
    }

    @Override
    public String what() {
        return "Vilolin";
    }

    @Override
    public void adjust() {
        System.out.println("Vilolin.adjust");
    }

    @Override
    public String toString() {
        return "Vilolin{}";
    }
}
