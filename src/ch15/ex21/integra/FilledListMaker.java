package ch.ex21.integra;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 17.03.2017.
 */
public class FilledListMaker<T> {
    List<T> create(T t, int n) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            list.add(t);  // вставляет один и тот же экземпляр
        }
        return list;
    }
}
