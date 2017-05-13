package ch21.ex37.codeb.robot;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ChassisBuilder implements Runnable{
    private CarQueue carQueue;
    private int counter = 0;

    public ChassisBuilder(CarQueue carQueue) {
        this.carQueue = carQueue;
    }


    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(500);
                Car c = new Car(counter++);
                System.out.println("ChassisBuilder created "+ c);
                carQueue.put(c);
            }
        } catch (InterruptedException e) {
            System.out.println("ChassisBuilder interrupted");
        }
        System.out.println("ChassisBuilder off");
    }
}
