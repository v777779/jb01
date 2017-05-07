package ch21.ex24.exercise;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Consumer implements Runnable{
    private Plant plant;
    private final int sleepTime = new Random().nextInt(50)+10;
    public Consumer(Plant plant) {
        this.plant = plant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {  // снимает флаг
                synchronized (this) {
                    while (!plant.itemReady) {
                        wait();
                    }
                }
// получаем объект от производителя
                synchronized (plant.producer) {         // producer не зайдет в изменение листа
                    System.out.println("Item added :"+plant.get()+" buffer size:"+plant.items.size());  // извлечь последний
                    plant.itemReady = false;            // сбросить флаг готовности
                    plant.producer.notify();            // оповестили всех что chef свободен
                }
                TimeUnit.MILLISECONDS.sleep(sleepTime);
            }

        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted");
        }
    }
}
