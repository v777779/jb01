package ch21.ex22.exercise;

import lib.utils.Time;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskFlag {
    private boolean flag = false;

    public  synchronized boolean get() {
        return flag;
    }

    public  synchronized void set() {
        this.flag = true;
    }


    public  synchronized void reset() {
        this.flag = false;
    }


    public static void check() {
        TaskFlag tFlag = new TaskFlag();
        ExecutorService exec = Executors.newCachedThreadPool();
        System.out.println("While active version:");
        exec.execute(new TaskOne(tFlag));
        exec.execute(new TaskTwo(tFlag));

        Time.sleep(250);

        System.out.println("\nWhile wait version:");
        exec.execute(new TaskOneWait(tFlag));
        exec.execute(new TaskTwoWait(tFlag));
        exec.shutdown();
        Time.sleep(250);
    }

}
