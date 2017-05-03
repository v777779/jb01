package ch21.ex17.exercise.office;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RadSensor2 implements Runnable {
    private static RadCounter2 radCount = new RadCounter2(); // один объект на все задачи
    private static List<RadSensor2> sensors = new ArrayList<>();
    private static boolean cancelled = false;  // единый флаг на все объекты
    private Random rnd = new Random();

    private int number = 0;
    private final int id;

    public RadSensor2(int id) {
        this.id = id;
        sensors.add(this);  // сохраняет задачу в списке от gc()
    }

    public synchronized static void cancel() {  // синхронный доступ на изменение
        cancelled = true;                        // не так важно в данном случае
    }

    public static int sumSensors() {     // вызывается после остановки
        int sum = 0;
        for (RadSensor2 sensor : sensors) {
            sum += sensor.getValue();     // entrances общий ресурс getValue() синхронный метод
        }
        return sum;
    }

    public static int getTotalCount() {     // вызывается после остановки
        return radCount.value();               // значение счетчика
    }

    public synchronized int getValue() {    // необязательно синхронно
        return number;
    }

    @Override
    public void run() {

        while (!cancelled) {
            if (rnd.nextInt(5) == 0) {
                synchronized (this) {   // синхронный доступ к инкременту number приватной переменной объекта
                    ++number;
                }                       // синхронный блок завершен
                radCount.increment();   // инкремент счетчика случайно но синхронно с датчиком
            }
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }

    }

}
