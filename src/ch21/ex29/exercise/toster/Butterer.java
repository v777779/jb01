package ch21.ex29.exercise.toster;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Butterer implements Runnable {
    private ToastQueue dryQueue;        // очередь входящая с объектами тост
    private ToastQueue finishedQueue;   // очередь выходящая с объектами тост


    public Butterer(ToastQueue dryQueue, ToastQueue finishedQueue) {
        this.dryQueue = dryQueue;
        this.finishedQueue = finishedQueue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {

                Toast t = dryQueue.take();  // взять тост из очереди входящей
                t.butter();                 // намазать масло
                System.out.println(t);      // распечатали
                finishedQueue.put(t);       // положить объект в очередь выходящую
            }
        } catch (InterruptedException e) {
            System.out.println("Butterer interrupted");
        }
        System.out.println("Butterer off");
    }
}
