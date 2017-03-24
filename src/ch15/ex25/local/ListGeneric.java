package ch15.ex25.local;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 18.03.2017.
 */
public class ListGeneric<T> {
    private List<T> listArray = new ArrayList<>();

    public void add(T item) {
        listArray.add(item);
    }

    public T get(int index) {
        return listArray.get(index);
    }

}
