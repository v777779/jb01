package ch21.ex21.codec;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaxOn implements Runnable{
private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("T1>>Wax On! ");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println("T1<200ms>");
                car.waxed();
                car.waitForBuffing();  // войти в Buffing
            }
        } catch (InterruptedException e) {
            System.out.println("Exit via interrupt");
        }
        System.out.println("Ending Wax On Task");
    }
}
