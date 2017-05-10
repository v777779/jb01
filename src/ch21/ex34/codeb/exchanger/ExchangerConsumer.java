package ch21.ex34.codeb.exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExchangerConsumer<T> implements Runnable {
    private Exchanger<List<T>> exchanger;
    private List<T> holder;
    private volatile T value;

    public ExchangerConsumer(Exchanger<List<T>> exchanger,List<T> holder) {
        this.exchanger = exchanger;
        this.holder = holder;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                holder = exchanger.exchange(holder); // получить список от producer
                System.out.println("consumer got :"+holder);
                for (T t : holder) {
                    value = t;
                    holder.remove(t);  // удаляем, так как потом отдадим producer
                }
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("Final value: "+value);

    }
}
