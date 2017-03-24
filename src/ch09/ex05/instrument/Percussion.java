package ch09.ex05.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Percussion implements Instrument {
    public Percussion() {
        System.out.println("Percussion.Constructor");
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
