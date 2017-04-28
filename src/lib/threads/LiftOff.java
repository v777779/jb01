package lib.threads;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;   // число потоков данного класса
    private final int id = taskCount++; // id данного потока

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {

        while (countDown-- > 0) {
            System.out.print(status()+" ");
        }
        Thread.yield();  // рекомендация планировщику освободить ресурсы под данную задачу для других
    }


    public String status() {
        return "#" + id + "("+((countDown > 0)? countDown+")":"LiftOff)\n");
    }
}
