package ch15.ex42.access.func;

/**
 * Created by V1 on 23.03.2017.
 */
public interface Collector<T> extends UnaryFunction<T,T> {
    T result(); // извлечение результата
}
