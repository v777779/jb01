package ch21.ex30.exercise;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Sender implements Runnable {
    private Random rnd = new Random();
    private BlockingQueue<Character> queue;
    public Sender(BlockingQueue<Character> queue ) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for(char c ='A';c< 'z';c++) {  // выдать символы алфавита
                    queue.put(c); // загоняем все символы
                }
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e+ " Sender interrupted");
        }

    }
}
