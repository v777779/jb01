package ch08.ex1.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Wind extends Instrument{

    @Override
    void play(Note note) {
        System.out.println("Wind.play."+ note);
    }
}
