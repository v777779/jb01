package ch21.ex10.exercise;


import lib.threads.FbCall;
import lib.utils.IGenerator;
import lib.utils.Time;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreadMethod2 {
    private static Random rnd = new Random();
    private static ExecutorService exec = Executors.newCachedThreadPool();

    public ThreadMethod2() { // ВНИМАНИЕ запуск в конструкторе потенциально опасен
    }

    public static Future<Integer> runTask(int n) {
        return exec.submit(new FbCall(n));
    }

    public static void shutdown() {
        Thread.yield();
        exec.shutdown();
    }


    public static void check() {
        ArrayList<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadMethod2.runTask(rnd.nextInt(5) + 5));  // входной параметр  n
        }
        Time.sleep(200);

        System.out.println("\nGet Results:");
        int index = 0;
        for (Future<Integer> fs : list) {  // прогоняем список
            try {
                System.out.print("#" + index + "." + fs.get() + " ");     // получить результат  с блокировкой текущего потока
                index++;
            } catch (Exception e) {
                System.out.println(e);
                return;
            } finally {
                ThreadMethod2.shutdown();  // закрыть poll потоков по любому
            }
        }
        System.out.println();
    }

    public static IGenerator<Integer> gen() {  // реализация внутреннего класса
        return new IGenerator<Integer>() {
            @Override
            public Integer next() {
                return new Random().nextInt(5) + 5;
            }
        };
    }

    public static IGenerator<Integer> gen2() {  //
        return () -> new Random().nextInt(5) + 5;
    }
}
