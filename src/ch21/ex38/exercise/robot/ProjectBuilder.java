package ch21.ex38.exercise.robot;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 11-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ProjectBuilder implements Runnable{
    private BuildQueue buildQueue;
    private int counter = 0;

    public ProjectBuilder(BuildQueue carQueue) {
        this.buildQueue = carQueue;
    }


    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(500);
                Building c = new Building(counter++);
                System.out.println("Project made: "+ c);
                buildQueue.put(c);
            }
        } catch (InterruptedException e) {
            System.out.println("ChassisBuilder interrupted");
        }
        System.out.println("ChassisBuilder off");
    }
}
