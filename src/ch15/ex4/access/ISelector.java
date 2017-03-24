package ch.ex4.access;

/**
 * Created by V1 on 14-Mar-17.
 */
public interface ISelector<T> {
    boolean checkEnd();
    T getCurrent();
    void nextIndex();
}
