package ch21.ex05.codea;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Vadim Voronov
 * Created: 28-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CallableDemo {
    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool(); // создаем pool потоков
        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new TaskWithResult(i)));  // входной параметр  номер потока =id
        }  // загнали все потоки в список  <Future<T>> и они сразу пошли на выполнение

        for (Future<String> fs : results) {  // прогоняем список
            try {
                System.out.println(fs.get());     // получить результат  с блокировкой текущего потока
                if(fs.isDone()) {
                    System.out.println(fs.get());  // получить результат если готов, иначе далее
                }

            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            }finally {
                exec.shutdown();  // закрыть poll потоков по любому
            }
        }

    }
}
