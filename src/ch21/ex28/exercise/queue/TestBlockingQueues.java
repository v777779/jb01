package ch21.ex28.exercise.queue;

import lib.threads.LiftOff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TestBlockingQueues {
    static void getkey() {
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void getkey(String message) {
        System.out.println(message);
        getkey();
    }

    static void test(String msg, BlockingQueue<LiftOff> queue) {
        System.out.println("\n"+msg);
        ExecutorService exec = Executors.newCachedThreadPool();

        exec.execute(new LiftOffRunner(queue));
        exec.execute(new LiftOffFiller(queue));
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        getkey("\nPress 'Enter' (" + msg + ")");
        exec.shutdownNow(); // остановить задачу
        System.out.println("Finished " + msg + " test");

    }

    public static void check() {
        test("LinkedBlockingQueue", new LinkedBlockingQueue<>());
        test("ArrayBlockingQueue", new ArrayBlockingQueue<>(3));
        test("SynchronousQueue", new SynchronousQueue<>());

    }
}
