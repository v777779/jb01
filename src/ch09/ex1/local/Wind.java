package ch09.ex1.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Wind extends Instrument {
    public Wind() {
        System.out.println("Wind.Constructor");
    }

    @Override
    public void play(Note note) {
        System.out.println("Wind.play");
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
