package ch09.ex01.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play");
    }

    @Override
    public void adjust() {
        System.out.println("Stringed.adjust");
    }

    @Override
    public String toString() {
        return "Stringed{}";
    }
}
