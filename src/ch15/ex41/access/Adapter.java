package ch15.ex41.access;

import ch15.ex41.include.AdapterC;
import ch15.ex41.include.AdapterQ;
import lib.utils.SimpleQueue;

import java.util.Collection;

/**
 * Created by V1 on 23.03.2017.
 */
public class Adapter {
    public static <T> ch15.ex41.include.AdapterC<T> getAutoAdapterC(Collection<T> c) {
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
