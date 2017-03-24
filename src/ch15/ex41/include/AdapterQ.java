package ch.ex41.include;

import lib.utils.SimpleQueue;

/**
 * Created by V1 on 23.03.2017.
 */
public class AdapterQ<T> implements IAddable<T> {
    private SimpleQueue<T> q;

    public AdapterQ(SimpleQueue<T> q) {
        this.q = q;
    }

    @Override
    public void add(T item) {
        q.add(item);
    }


}
