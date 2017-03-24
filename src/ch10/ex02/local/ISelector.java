package ch10.ex02.local;

/**
 * Created by V1 on 14-Feb-17.
 */
public interface ISelector {
    boolean checkEnd();
    Object getCurrent();
    void nextIndex();
}
