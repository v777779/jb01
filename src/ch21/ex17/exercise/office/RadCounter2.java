package ch21.ex17.exercise.office;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RadCounter2 {
    private int count = 0;
    private Random rnd = new Random();

    public synchronized int increment() {   // для проверки удалить synchronized
        count++;
        return count;              // вот такой хитрый инкремент

    }
    public synchronized int value() {  // не так обязательно
        return count;
    }

    public static void main(String[] args) {
        check();
    }
    public static void check() {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            for (int i = 0; i < 2; i++) {
                exec.execute(new RadSensor2(i));
            }
            TimeUnit.SECONDS.sleep(1);
            RadSensor2.cancel(); // отрубить задачи
            exec.shutdown();
            if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS)) {
                System.out.println("Some Tasks were not terminated");
            }
// все потоки остановлены
            System.out.println("Total: " + RadSensor2.getTotalCount());
            System.out.println("Sum of Sensors: " + RadSensor2.sumSensors());


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
