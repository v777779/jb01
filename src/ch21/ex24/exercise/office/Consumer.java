package ch21.ex24.exercise.office;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Consumer implements Runnable {
    private int delay;
    private FlowQueue<Item> input;

    public Consumer(FlowQueue<Item> input, int sleepTime) {
        this.input = input;
        delay = sleepTime;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(input.get());//+" "+input.getMaxSize());
                TimeUnit.MILLISECONDS.sleep(delay);
            } catch (InterruptedException e) {
//                System.out.println("interrupted");
                return;
            }
        }
    }
}
