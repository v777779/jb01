package ch21.ex20.exercise;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LiftOff2 implements Runnable {
    protected int countDown = 5000;
    private static int taskCount = 0;   // число потоков данного класса
    private final int id = taskCount++; // id данного потока

    public LiftOff2() {
    }

    public LiftOff2(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {

        while (countDown-- > 0) {
            System.out.print(status() + " ");
            if (Thread.interrupted()) {
                System.out.println("#" + id + " interrupted");
                return;
            }
        }

        Thread.yield();  // рекомендация планировщику освободить ресурсы под данную задачу для других
    }


    public String status() {
        return "#" + id + "(" + ((countDown > 0) ? countDown + ")" : "LiftOff)\n");
    }
}
