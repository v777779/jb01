package ch21.ex29.codea.toster;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Butterer implements Runnable {
    private ToastQueue dryQueue;        // очередь входящая с объектами тост
    private ToastQueue butteredQueue;   // очередь выходящая с объектами тост
    private int count = 0;
    private Random rnd = new Random();


    public Butterer(ToastQueue dryQueue, ToastQueue butteredQueue) {
        this.dryQueue = dryQueue;
        this.butteredQueue = butteredQueue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                Toast t = dryQueue.take(); // взять тост из очереди входящей
                t.butter(); // намазать масло
                System.out.println(t); // распечатали
                butteredQueue.put(t); // положить объект в очередь выходящую
            }
        } catch (InterruptedException e) {
            System.out.println("Butterer interrupted");
        }
        System.out.println("Butterer off");
    }
}
