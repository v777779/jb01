package ch15.ex41.include;

import lib.utils.SimpleQueue;

import java.util.Collection;

/**
 * Created by V1 on 23.03.2017.
 */
public class Adapter {
    public static <T> AdapterC<T> getAutoAdapterC(Collection<T> c) {
        return new AdapterC<T>(c);

    }
    public static <T> AdapterQ<T> getAutoAdapterQ(SimpleQueue<T> q) {
        return new AdapterQ<T>(q);

    }

//    public static <T> SimpleQueueAdd<T> getAutoSimpleQAdd() {  // нет смысла, все равно тип прописывать
//        return new SimpleQueueAdd<>();
//
//    }
//
}
