package ch09.ex05.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Brass extends Wind {
    public Brass() {
        System.out.println("Brass.Constructor");
    }

    @Override
    public void play(Note note) {
        System.out.println("Brass.play." + note);
    }
    @Override
    public String what() {
        return "Brass";
    }
    @Override
    public String toString() {
        return "Brass{}";
    }

}
