package ch18.ex11.access.variant;

/**
 * Created by V1 on 10-Mar-17.
 */
public interface IFactoryGC<T extends Event> {
    T create();
    IFactoryGC<T> next(long delay);


}
