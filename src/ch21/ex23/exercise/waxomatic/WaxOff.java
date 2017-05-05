package ch21.ex23.exercise.waxomatic;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class WaxOff implements Runnable{
private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.waitForWaxing();            // зацепиться в Waxing пока не сменится флаг
                System.out.println("T2>>Wax Off! ");
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println("T2<200ms>");
                car.buffed();
            }
        } catch (InterruptedException e) {
            System.out.println("Exit via interrupt");
        }
        System.out.println("Ending Wax Off Task");
    }
}
