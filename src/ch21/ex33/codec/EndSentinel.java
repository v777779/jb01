package ch21.ex33.codec;


import java.util.concurrent.ExecutorService;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */

public class EndSentinel extends PrioritizedTask {
    private ExecutorService exec;

    public EndSentinel(ExecutorService exec) {
        super(-1); // самый низкий приоритет, вызывать последним
        this.exec = exec;
    }

    @Override
    public void run() {
        int count = 0;
        for (PrioritizedTask pTask : sequence) {
            System.out.print(pTask.summary() + " ");
            if (++count % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(this + " calling shutdownNow()");
        exec.shutdownNow();
    }

}
