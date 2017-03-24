package ch.ex41.include;

import java.util.Collection;

/**
 * Created by V1 on 23.03.2017.
 */
public class AdapterC<T> implements IAddable<T> {
    private Collection<T> c;

    public AdapterC(Collection<T> c) {   // передается по ссылке, доступ к ней есть снаружи
        this.c = c;
    }

    @Override
    public void add(T item) {
        c.add(item);
    } // класс адаптер для коллекций



}
