package ch.ex34.access;

/**
 * Created by V1 on 21.03.2017.
 */
abstract public class CommonSB <T extends CommonSB<T>>  {
    abstract public T change(T arg);


    public T getChange(T arg) {
        return change(arg);
    }
}
