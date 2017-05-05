package ch21.ex22.exercise;

import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskOne implements Runnable {
    TaskFlag taskFlag;

    public TaskOne(TaskFlag taskFlag) {
        this.taskFlag = taskFlag;
    }

    @Override
    public void run() {
        try{
            System.out.println("TaskOne started");
            TimeUnit.MILLISECONDS.sleep(100);
            taskFlag.set();

        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("TaskOne finished");
    }
}
