package ch21.ex17.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 03-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RadCounter {
    private List<RadSensor> list = new ArrayList<>();

    private int count = 0; // один объект на все задачи

    public void collect() {                    // вызывается после остановки
        count = 0;
        for (RadSensor sensor : list) {
            count += sensor.getValue();         // getValue() синхронный метод
        }
    }

    private class MyCancel {
        private boolean cancel = false;

        public boolean isCancel() {
            return cancel;
        }

        public void setCancel(boolean cancel) {
            this.cancel = cancel;
        }
    }

    public void run() {
        MyCancel mc = new MyCancel();
        System.out.println("RadCounter started:");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                mc.setCancel(true);
            }
        }, 1000);  // сработать через 1 секунду
        try {

            while (!mc.isCancel()) {
                collect();
                System.out.println(this);
                TimeUnit.MILLISECONDS.sleep(100); // каждые 100ms запросить новые данные
            }
            timer.cancel(); // выключить таймер
            RadSensor.cancel(); // вырубить все счетчики

            TimeUnit.MILLISECONDS.sleep(150); // ждем завершения потоков
            collect();
            System.out.println("RadCounter finished");
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
    }


    public static void check() {
        ExecutorService exec = Executors.newCachedThreadPool();
        RadCounter rc = new RadCounter();

        for (int i = 0; i < 2; i++) {
            rc.list.add(new RadSensor(i));  // объекты созданы и сохранениы в список
        }
        System.out.println("Starting RadSensors:");
        for (RadSensor radSensor : rc.list) {
            exec.execute(radSensor);
        }
        rc.run();
        exec.shutdown();
        System.out.println(rc);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("RadCounter: %4d ", count)); // метод count потоки не имеют к нему доступ
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%4d ", list.get(i).getValue()));  // распечатка значений
        }

        return sb.toString();
    }
}
