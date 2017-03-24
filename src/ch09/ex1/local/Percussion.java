package ch.ex1.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play");
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
