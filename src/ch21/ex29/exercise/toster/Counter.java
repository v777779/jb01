package ch21.ex29.exercise.toster;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Counter {
    private int counter = 0;
    synchronized void setCounter() {
        counter++;
    }

    synchronized int getCounter() {
        return counter;
    }

    synchronized int getNext() {
        counter++;
        return counter;
    }

}
