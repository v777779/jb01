package ch21.ex24.exercise;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Producer implements Runnable{
    private final int sleepTime = new Random().nextInt(50)+10;
    private Plant plant;
    private int count = 0;

    public Producer(Plant plant) {
        this.plant = plant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {                // постоянно заходит проверить готовность
                    while (plant.itemReady) {       // пока не забран объект ждем
                        wait();                      // отпустить объект this и сидеть в wait() по this
                    }
                }

                if (count >= 10) {
                    System.out.println("Production is done");
                    plant.exec.shutdownNow();           // interrupt() >> all  отрубить все службы
                }

                synchronized (plant.consumer) {         // захватить waitPerson
                    plant.put(new Item(count++));
                    plant.itemReady = true;             // флаг готовности объекта
                    plant.consumer.notify();            // известить Consumer что можно забирать
                }
                TimeUnit.MILLISECONDS.sleep(sleepTime);
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted");
        }


    }
}
