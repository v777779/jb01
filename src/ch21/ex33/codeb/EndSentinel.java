package ch21.ex33.codeb;

import java.util.concurrent.ExecutorService;

/**
 * Vadim Voronov
 * Created: 08-May-17.
 * email: vadim.v.voronov@gmail.com
 */

public class EndSentinel extends DelayedTask {
    private ExecutorService exec;

    public EndSentinel(int delta, ExecutorService exec) {
        super(delta);
        this.exec = exec;
    }

    @Override
    public void run() {
        for (DelayedTask delayedTask : sequence) {
            System.out.print(delayedTask.summary() + " ");
        }
        System.out.println();
        System.out.println(this + " calling shutdownNow()");
        exec.shutdownNow();
    }

}
