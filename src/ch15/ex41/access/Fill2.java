package ch15.ex41.access;

import ch15.ex41.include.AdapterQ;
import ch15.ex41.include.IAddable;
import lib.utils.IGenerator;
import lib.utils.SimpleQueue;

/**
 * Created by V1 on 23.03.2017.
 */
public class Fill2 {
    public static <T> void fill(IAddable<T> s, Class<?extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++) {
                s.add(type.newInstance()); // добавить в последовательность по интерфейсу
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> void fill(IAddable<T> seq, IGenerator<T> gen, int size) {
            for (int i = 0; i < size; i++) { // перегруженный метод добавление через генератор
                seq.add(gen.next()); // добавить в последовательность по интерфейсу
            }
    }

    public static <T> void fill(AdapterQ<T> tAdapterQ, Class<SimpleQueue> simpleQueueClass, int i) {
    }
}
