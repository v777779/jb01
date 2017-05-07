package ch21.ex29.codea.toster;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Toaster implements Runnable {
    private ToastQueue toastQueue; // очередь с объектами тост
    private int count = 0;
    private Random rnd = new Random();

    public Toaster(ToastQueue toastQueue) { // внешний экземпляр очереди
        this.toastQueue = toastQueue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(100+rnd.nextInt(500));

                Toast t = new Toast(count++); // счетчик тостов
                System.out.println(t); // распечатали
                toastQueue.put(t); // положили в очередь
            }
        } catch (InterruptedException e) {
            System.out.println("Toaster interrupted");
        }
        System.out.println("Toaster off");
    }
}
