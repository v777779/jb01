package ch21.ex42.exercise.car;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaxOff implements Runnable {
    private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            System.out.println("Wax Off! ");
                TimeUnit.MILLISECONDS.sleep(210);
            car.buffed();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("WaxOff interrupted");

        }
    }
}
