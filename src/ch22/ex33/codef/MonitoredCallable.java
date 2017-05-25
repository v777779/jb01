package ch22.ex33.codef;

import javax.swing.*;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MonitoredCallable implements Callable<String> {
    private static int counter = 0;
    private final int id = counter++;
    private final ProgressMonitor monitor;
    private final static int MAX = 8;

    public MonitoredCallable(ProgressMonitor monitor) {
        this.monitor = monitor;
        monitor.setNote(toString());  // это метод монитора в Note пишем свой this.toString()
        monitor.setMaximum(MAX - 1);
        monitor.setMillisToPopup(500);  // время до всплытия
    }

    @Override
    public String call() throws Exception {
        System.out.println(this + " started");
        try {
            for (int i = 0; i < MAX; i++) {
                TimeUnit.MILLISECONDS.sleep(500);
                if (monitor.isCanceled()) {
                    Thread.currentThread().interrupt(); // return работает, throw new InterruptException() работает
                }
                final int progress = i;
                SwingUtilities.invokeLater(new Runnable() {  // дать задание Swing показать monitor
                    @Override
                    public void run() {
                        monitor.setProgress(progress);
                    }
                });

            }
        } catch (InterruptedException e) {
            monitor.close();
            System.out.println(this + " interrupted");
            return "Result: " + this + " interrupted";
        }
        System.out.println(this + " completed");
        return "Result: " + this + " completed";
    }

    @Override
    public String toString() {
        return "Task " + id;
    }
}
