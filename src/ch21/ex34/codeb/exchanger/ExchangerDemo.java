package ch21.ex34.codeb.exchanger;


import lib.threads.Fat;

import java.util.List;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ExchangerDemo {
    public static int size = 10;
    public static int delay = 1;

    public static void check() {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            Exchanger<List<Fat>> xc = new Exchanger<>();
            List<Fat> producerList = new CopyOnWriteArrayList<>();
            List<Fat> consumerList = new CopyOnWriteArrayList<>();
            exec.execute(new ExchangerProducer<>(xc, new Fat.FatFactory(), producerList));
            exec.execute(new ExchangerConsumer<>(xc, consumerList));

            TimeUnit.SECONDS.sleep(delay);
            exec.shutdownNow();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
