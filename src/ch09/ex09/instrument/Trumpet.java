package ch09.ex09.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Trumpet extends Brass {
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
