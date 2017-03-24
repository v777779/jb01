package ch08.ex07.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Percussion extends Instrument {
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
