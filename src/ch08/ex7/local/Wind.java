package ch08.ex7.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play."+note);
    }

    @Override
    public String what(){
        return "Wind";
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
