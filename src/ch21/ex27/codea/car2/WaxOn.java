package ch21.ex27.codea.car2;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaxOn implements Runnable{
private Car2 car;

    public WaxOn(Car2 car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Wax On! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitForBuffing();  // войти в Buffing
            }
        } catch (InterruptedException e) {
            System.out.println("Exit via interrupt");
        }
        System.out.println("Ending Wax On Task");
    }
}
