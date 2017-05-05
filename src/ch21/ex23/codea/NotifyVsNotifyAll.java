package ch21.ex23.codea;

import lib.utils.Time;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 05-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class NotifyVsNotifyAll {
    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Task()); // 5 задач одного типа
        }
        exec.execute(new Task2()); // 1 задача другого типа

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            boolean prod = true;
            @Override
            public void run() {
                if (prod) {  // мигалка выдает каждые 400ms сигнал notify или notifyAll
                    System.out.print("\nnotify() ");
                    Task.blocker.prod();
                    prod = false;
                } else {
                    System.out.println("\nnotifyAll() ");
                    Task.blocker.prodAll();
                    prod = true;
                }
            }
        },400,400);

        Time.sleep(5000);
        timer.cancel();
        System.out.println("\nTimer cancelled");
        Time.sleep(500);
        System.out.println("Task2.blocker.prodAll");
        Task2.blocker.prodAll();
        Time.sleep(500);
        System.out.println("\nShutting down");
        exec.shutdownNow(); // отослать всем interrupt()
    }
}
