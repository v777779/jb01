package ch21.ex29.codea.toster;

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
        ToastQueue dryQueue = new ToastQueue();
        ToastQueue butteredQueue = new ToastQueue();
        ToastQueue finishedQueue = new ToastQueue();

        exec.execute(new Toaster(dryQueue));
        exec.execute(new Butterer(dryQueue, butteredQueue));
        exec.execute(new Jammer(butteredQueue, finishedQueue));
        exec.execute(new Eater(finishedQueue));  // вырубает головной поток

        try {  // 5 секунд задержки на конвейер
            TimeUnit.MILLISECONDS.sleep(5000);  // в случае ошибок Eater выдает interrupt()
        } catch (InterruptedException e) {// сюда попадаем по запросу Eater
            System.out.println("ToastOMatic interrupted"); // и уже отсюда общий interrupt() выдергивает все потоки
        }
        exec.shutdownNow(); // сюда попадаем после выруба повторный вызов работает нормально


    }
}
