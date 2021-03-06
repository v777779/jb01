package ch09.ex09.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Percussion extends Instrument {

    @Override
    public String what() {
        return "Percussion{}";
    }

    @Override
    public void play(Note note) {
        System.out.println("Percussion.play."+note);
    }

    @Override
    public void adjust() {
        System.out.println("Percussion.adjust");
    }

    @Override
    public String toString() {
        return "Percussion{}";
    }
}
