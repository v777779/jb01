package ch.ex10.instrument;

/**
 * Created by V1 on 09-Feb-17.
 */
abstract public class Instrument  {

    abstract public String what();
    abstract public void adjust();

    @Override
    public String toString() {
        return "Instrument{Misician}";
    }

}
