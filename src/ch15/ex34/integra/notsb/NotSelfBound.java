package ch15.ex34.integra.notsb;

/**
 * Created by V1 on 21.03.2017.
 */
public class NotSelfBound<T> {
    T element;

    public void set(T arg) {
        element = arg;
    }

    public T get() {
        return element;
    }
}
