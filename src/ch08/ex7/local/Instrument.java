package ch08.ex7.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play."+note);
    }

    public String what(){
        return toString();
    }

    public void adjust() {
        System.out.println("Instrument.adjust");
    }

    @Override
    public String toString() {
        return "Instrument{}";
    }

}
