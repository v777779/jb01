package ch.ex36.access;

import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public interface IProcessor<T,E  extends Exception,F extends Exception> {
    void process(List<T> list) throws E, F;
}
