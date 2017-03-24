package ch.ex41.local;

import java.util.Collection;

/**
 * Created by V1 on 23.03.2017.
 */
public class Fill {  // реализация добавления объектов в список типа Collection
    public static <T> void fill(Collection<T> col, Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size ; i++) {
                col.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new  RuntimeException(e);
        }
    }
}
