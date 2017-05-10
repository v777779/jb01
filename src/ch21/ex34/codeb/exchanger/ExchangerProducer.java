package ch21.ex34.codeb.exchanger;

import lib.utils.IGenerator;

import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExchangerProducer<T> implements Runnable {
    private IGenerator<T> generator;
    private Exchanger<List<T>> exchanger;
    private List<T> holder;

    public ExchangerProducer(Exchanger<List<T>> exchanger, IGenerator<T> generator, List<T> holder) {
        this.exchanger = exchanger;
        this.generator = generator;
        this.holder = holder;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                for (int i = 0; i < ExchangerDemo.size; i++) {
                    holder.add(generator.next());   // заполняется локальный список
                }
                System.out.println("\nproducer made:"+holder );
                holder = exchanger.exchange(holder); // полный список меняется с пустым

                TimeUnit.MILLISECONDS.sleep(100);

            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }

    }
}
