package ch21.ex10.exercise.official;


import lib.utils.Fibonacci;
import lib.utils.IGenerator;
import lib.utils.Time;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Vadim Voronov
 * Created: 29-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ThreadMethod4  {
    private static Random rnd = new Random();
    private static ExecutorService exec;

    public ThreadMethod4() { // ВНИМАНИЕ запуск в конструкторе потенциально опасен
    }

    public static synchronized void init() {
        if (exec == null) {
            exec = Executors.newCachedThreadPool();
        }
    }

    public static synchronized void shutdown() {  // synchronized для работы между потоками
        if (exec != null) {
            exec.shutdown();
        }
        exec = null;
    }

    public static Future<Integer> runTask(int n) {
        return exec.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                Fibonacci f = new Fibonacci();
                for (int i = 0; i < n; i++) {
                    sum += f.next();
                }
                return sum;
            }
        });
    }

    public static void check() {
        ArrayList<Future<Integer>> list = new ArrayList<>();
        ThreadMethod4.init();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadMethod4.runTask(rnd.nextInt(5) + 5));  // входной параметр  n
        }
        Time.sleep(200);

        System.out.println("Get Results:");
        int index = 0;
        for (Future<Integer> fs : list) {  // прогоняем список
            try {
                System.out.print("#" + index + "." + fs.get() + " ");     // получить результат  с блокировкой текущего потока
                index++;
            } catch (Exception e) {
                System.out.println(e);
                return;
            } finally {
                ThreadMethod4.shutdown();  // закрыть poll потоков по любому
            }
        }
        System.out.println();
    }



}
