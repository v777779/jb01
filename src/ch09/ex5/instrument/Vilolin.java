package ch.ex5.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Vilolin extends Stringed {
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
