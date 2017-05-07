package ch21.ex29.codea.toster;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Jammer implements Runnable {
    private ToastQueue butteredQueue;        // очередь входящая с объектами тост
    private ToastQueue finishedQueue;   // очередь выходящая с объектами тост
    private int count = 0;
    private Random rnd = new Random();


    public Jammer(ToastQueue butteredQueue, ToastQueue finishedQueue) {
        this.butteredQueue = butteredQueue;
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                Toast t = butteredQueue.take(); // взять тост из очереди входящей
                t.jam();                        // нанести джем
                System.out.println(t);          // распечатали
                finishedQueue.put(t);           // положить объект в очередь выходящую
            }
        } catch (InterruptedException e) {
            System.out.println("Jammer interrupted");
        }
        System.out.println("Jammer off");
    }
}
