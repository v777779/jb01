package ch09.ex5.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
    public interface Instrument {
    int VALUE_INT = 5;
    void play(Note note);
    String what();   // analog toString
    void adjust();

}
