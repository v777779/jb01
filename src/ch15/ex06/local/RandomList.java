package ch15.ex06.local;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by V1 on 15.03.2017.
 */
public class RandomList<T> {
    private ArrayList<T> list = new ArrayList<T>();
    private Random rnd = new Random();
    public void add(T item) {
        list.add(item);
    }
    public T select() {
        return list.get(rnd.nextInt(list.size())); // создать список и выдать любой элемент
    }

    public int size() {
        return list.size();
    }


}
