package ch21.ex29.exercise.toster;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 07-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ToastOMatic {
    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        Counter counter = new Counter();
        ToastQueue dryQueue = new ToastQueue();
        ToastQueue dryQueue2 = new ToastQueue();
        ToastQueue finishedQueue = new ToastQueue();

        exec.execute(new Toaster(dryQueue,counter));
        exec.execute(new Toaster(dryQueue2,counter)); // второй конвейер
        exec.execute(new Butterer(dryQueue, finishedQueue));
        exec.execute(new Jammer(dryQueue2, finishedQueue));
        exec.execute(new Eater(finishedQueue, Thread.currentThread()));  // вырубает головной поток

        try {  // 5 секунд задержки на конвейер
            TimeUnit.MILLISECONDS.sleep(1000);  // в случае ошибок Eater выдает interrupt()
        } catch (InterruptedException e) {// сюда попадаем по запросу Eater
            System.out.println("ToastOMatic interrupted"); // и уже отсюда общий interrupt() выдергивает все потоки
        }
        exec.shutdownNow(); // сюда попадаем после выруба повторный вызов работает нормально


    }
}
