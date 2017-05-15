package ch21.ex42.exercise.car;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaxOn implements Runnable {
    private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            System.out.println("Wax On! ");
            TimeUnit.MILLISECONDS.sleep(100);
            car.waxed();
        } catch (NullPointerException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {
            System.out.println("WaxOn interrupted");


        }

    }
}
