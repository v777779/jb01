package ch21.ex24.exercise.office;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ProducerConsumer {
    public static void check() {
        int producerSleep = new Random().nextInt(500)+100;
        int consumerSleep = new Random().nextInt(500)+100;

        System.out.println("producerSleep : "+producerSleep);
        System.out.println("consumerSleep : "+consumerSleep);

        FlowQueue<Item> fq = new FlowQueue<>(100); // максимальный размер
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new Producer(fq,producerSleep));
        exec.execute(new Consumer(fq,consumerSleep));
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        exec.shutdownNow();

    }
}
