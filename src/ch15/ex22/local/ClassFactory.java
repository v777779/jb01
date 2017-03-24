package ch.ex22.local;

/**
 * Created by V1 on 17.03.2017.
 */
public class ClassFactory<T> {
    T x; // экземпляр Generic класса

    public ClassFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e); // скрытое Exception
        }

    }
}
