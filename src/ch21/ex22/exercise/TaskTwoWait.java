package ch21.ex22.exercise;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TaskTwoWait implements Runnable {
    final TaskFlag taskFlag;

    public TaskTwoWait(TaskFlag taskFlag) {
        this.taskFlag = taskFlag;
    }

    @Override
    public void run() {
        long counter = 0;

        try {
            System.out.println("TaskTwo started");
            while (!taskFlag.get()) {  // waiting for flag
                counter++;
                synchronized (taskFlag) {
                    taskFlag.wait();
                }
            }
            taskFlag.reset();

            System.out.println("TaskTwo reseted:" + counter);
        } catch (InterruptedException e) {
            System.out.println("TaskTwo interrupted");
        }
        System.out.println("TaskTwo finished");
    }
}
