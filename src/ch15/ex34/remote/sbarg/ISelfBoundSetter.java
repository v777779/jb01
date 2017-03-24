package ch15.ex34.remote.sbarg;

/**
 * Created by V1 on 21.03.2017.
 */
public interface ISelfBoundSetter<T extends ISelfBoundSetter<T>> {
    void set(T arg); // T тип самоограничивающий интерфейс
}
