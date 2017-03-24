package ch09.ex09.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Wind extends Instrument {
    @Override
    public String what() {
        return "Wind{}";
    }

    @Override
    public void play(Note note) {
        System.out.println("Wind.play."+note);
    }

    @Override
    public void adjust() {
        System.out.println("Wind.adjust");
    }

    @Override
    public String toString() {
        return "Wind{}";
    }
}
