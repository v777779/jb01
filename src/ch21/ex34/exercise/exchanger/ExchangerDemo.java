package ch21.ex34.exercise.exchanger;


import lib.ball.Ball;

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
            Exchanger<List<Ball>> xc = new Exchanger<>();
            List<Ball> producerList = new CopyOnWriteArrayList<>();
            List<Ball> consumerList = new CopyOnWriteArrayList<>();
            exec.execute(new ExchangerProducer<>(xc, new Ball.Factory(), producerList));
            exec.execute(new ExchangerConsumer<>(xc, consumerList));

            TimeUnit.SECONDS.sleep(delay);
            exec.shutdownNow();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//                exec.execute(new ExchangerProducer<>(xc, new IGenerator<Ball>() {
//        @Override
//        public Ball next() {
//            return new Ball();
//        }
//    }, producerList));

}
