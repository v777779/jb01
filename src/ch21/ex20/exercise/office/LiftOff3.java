package ch21.ex20.exercise.office;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LiftOff3 implements Runnable {
    protected int countDown = 5000;
    private static int taskCount = 0;   // число потоков данного класса
    private final int id = taskCount++; // id данного потока

    public LiftOff3() {
    }

    public LiftOff3(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("#" + id + " interrupted");
                return;
            }
            System.out.print(status() + " ");
            Thread.yield();  // рекомендация планировщику освободить ресурсы под данную задачу для других
        }

    }


    public String status() {
        return "#" + id + "(" + ((countDown > 0) ? countDown + ")" : "LiftOff)\n");
    }
}
