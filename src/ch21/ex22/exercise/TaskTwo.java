package ch21.ex22.exercise;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskTwo implements Runnable {
    TaskFlag taskFlag;

    public TaskTwo(TaskFlag taskFlag) {
        this.taskFlag = taskFlag;
    }

    @Override
    public void run() {
        long counter = 0;
        System.out.println("TaskTwo started");

        while (!taskFlag.get()) {  // waiting for flag
            counter++;
        }
        taskFlag.reset();
        System.out.println("TaskTwo reseted:" + counter);
        System.out.println("TaskTwo finished");
    }
}
