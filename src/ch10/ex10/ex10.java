package ch.ex10;

import ch.ex10.access.IPlay;
import ch.ex10.access.Play;

/**
 * Created by V1 on 15-Feb-17.
 */
public class ex10 {
    public static void main(String[] args) {
        Play t = new Play();
        IPlay p1 = t.getTape(true);
        IPlay p2 = t.getTape(false);
        p1.play();
        p2.play();
    }
}
