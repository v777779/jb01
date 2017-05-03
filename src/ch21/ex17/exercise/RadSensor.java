package ch21.ex17.exercise;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RadSensor implements Runnable {

    private static boolean cancelled = false;  // единый флаг на все объекты

    private Random rnd = new Random();
    private final int id;
    private int count = 0;

    public RadSensor(int id) {
        this.id = id;
    }

    public synchronized void setValue() {            // для проверки удалить synchronized
        count = rnd.nextInt(10);
    }


    public synchronized int getValue() {  // не так обязательно
        return count;
    }

    public synchronized static void cancel() {  // синхронный доступ на изменение
        cancelled = true;                        // не так важно в данном случае
    }


    @Override
    public void run() {
        try {
            while (!cancelled) {
                setValue();
                TimeUnit.MILLISECONDS.sleep(200); // every 10ms
            }
        } catch (InterruptedException e) {
            System.out.println("#" + id + " interrupted");
        }
    }
}
