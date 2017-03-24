package ch.ex42.local.func;

/**
 * Created by V1 on 23.03.2017.
 */
public interface Combiner<T> {
    T combine(T x, T y);
}
