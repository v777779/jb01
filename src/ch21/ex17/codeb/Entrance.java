package ch21.ex17.codeb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Entrance implements Runnable {
    private static Count count = new Count(); // один объект на все задачи
    private static List<Entrance> entrances = new ArrayList<>();
    private static boolean cancelled = false;  // единый флаг на все объекты

    private int number = 0;
    private final int id;


    public Entrance(int id) {
        this.id = id;
        entrances.add(this);  // сохраняет задачу в списке от gc()
    }

    public synchronized static void cancel() {  // синхронный доступ на изменение
        cancelled = true;                        // не так важно в данном случае
    }

    public static int sumEntrances() {     // вызывается после остановки
        int sum = 0;
        for (Entrance entrance : entrances) {
            sum += entrance.getValue();     // entrances общий ресурс getValue() синхронный метод
        }
        return sum;
    }

    public static int getTotalCount() {     // вызывается после остановки
        return count.value();               // значение счетчика
    }

    public synchronized int getValue() {    // необязательно синхронно
        return number;
    }

    @Override
    public void run() {
        while (!cancelled) {
            synchronized (this) {   // синхронный доступ к инкременту number приватной переменной объекта
                ++number;
            }                       // синхронный блок завершен
            System.out.println(this + " Total: "+count.increment()); // синхронный метод count общего для всех потоков
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
        }
        System.out.println("stopping "+this);
    }

    @Override
    public String toString() {
        return "Entrance "+ id + ": "+getValue();
    }
}
