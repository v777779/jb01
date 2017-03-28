package ch17.ex08.access;

/**
 * Created by V1 on 28-Mar-17.
 */
public interface ISListIterator<T> {
    boolean hasNext();
    Link next();
    void add();
    void add(T arg);
    void remove();
    void remove(T arg);
    void removeAll();

}
