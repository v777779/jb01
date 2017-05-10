package ch21.ex34.codea;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SemaphoreDemo {
    private static final int SIZE = 25;

    public static void check() {
        try {
            final Pool<Fat> pool = new Pool<>(Fat.class, SIZE);
            ExecutorService exec = Executors.newCachedThreadPool();
            for (int i = 0; i < SIZE; i++) {
                exec.execute(new CheckoutTask<>(pool));
            }
            System.out.println("All CheckoutTasks created");
            List<Fat> list = new ArrayList<>();
// main checks out all entries
            for (int i = 0; i < SIZE; i++) {
                Fat f = pool.checkOut();
                System.out.println(i + ": main() thread checked out " + f); // распечатать объект
//              f.operation();
                list.add(f); // добавить извлеченный объект
            }
            Future<?> blocked = exec.submit(new Runnable() {
                @Override
                public void run() {  // так как все объекты выданы, то Thread блокируется
                    try {
                        pool.checkOut();
                    } catch (InterruptedException e) {
                        System.out.println("Blocked checkOut() interrupted");
                    }
                    System.out.println("Blocked thread finished");
                }
            });
            TimeUnit.MILLISECONDS.sleep(1000);

            blocked.cancel(true); // выдрать из блокировки
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println("Checking in objects in list:"+list);
            for (Fat fat : list) {
                pool.checkIn(fat);
            }
            for (Fat fat : list) { // повторное впихивание не блокирует
                pool.checkIn(fat);
            }


            exec.shutdown(); // прекратить работу
            System.out.println("Shutdown all");
            TimeUnit.MILLISECONDS.sleep(100);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
