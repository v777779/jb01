package ch21.ex33.exercise;

import java.util.*;
import java.util.concurrent.*;

/**
 * Vadim Voronov
 * Created: 09-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class GreenHouseScheduler {
    private volatile boolean light = false;
    private volatile boolean water = false;
    private String thermostat = "Day";
    private boolean cancel = false;

    ExecutorService scheduler = Executors.newCachedThreadPool(); // число задач
    private DelayQueue<DelayedTask> queue = new DelayQueue<>();


    public synchronized void setLight(boolean value) {
        this.light = value;
    }

    public synchronized void setWater(boolean value) {
        water = true;
    }

    public synchronized String getThermostat() {
        return thermostat;
    }

    public synchronized void setThermostat(String value) {
        thermostat = value;
    }

    public synchronized void setCancel() {
        cancel = true;
    }

    public synchronized boolean getCancel() {
        return cancel;
    }

    public void schedule(Runnable event, long delay) {  // постановка задачи
        queue.put(new DelayedTask(event,delay));

    }

    public void repeat(Runnable event, long initialDelay, long period) {
        queue.put(new DelayedTask(event,initialDelay,period,queue));

    }


    class LightOn implements Runnable {
        @Override
        public void run() {
//user code
            System.out.println("Turning on lights");
            setLight(true);
        }
    }

    class LightOff implements Runnable {
        @Override
        public void run() {
//user code
            System.out.println("Turning off lights");
            setLight(false);
        }
    }

    class WaterOn implements Runnable {
        @Override
        public void run() {
//user code
            System.out.println("Turning GreenHouse water on");
            setWater(true);
        }
    }

    class WaterOff implements Runnable {
        @Override
        public void run() {
//user code
            System.out.println("Turning GreenHouse water off");
            setWater(false);
        }
    }

    class ThermostatNight implements Runnable {
        @Override
        public void run() {
//user code
            System.out.println("Thermostat to night setting");
            setThermostat("Night");
        }
    }

    class ThermostatDay implements Runnable {
        @Override
        public void run() {
//user code
            System.out.println("Thermostat to day setting");
            setThermostat("Day");
        }
    }

    class Bell implements Runnable {
        @Override
        public void run() {
//user code
            System.out.println("Bing!");
        }
    }

    class Terminate implements Runnable {
        private class DataSummary implements Runnable {
            @Override
            public void run() {
                for (DataPoint datum : data) {
                    System.out.println(datum);
                }
            }
        }

        @Override
        public void run() {
//user code
            System.out.println("Terminating");
            setCancel();
            Thread thread = new Thread(new DataSummary());
            thread.start(); // запуск вывода результатов
        }
    }

    static class DataPoint {
        final Calendar time;
        final float temperature;
        final float humidity;

        public DataPoint(Calendar time, float temperature, float humidity) {
            this.time = time;
            this.temperature = temperature;
            this.humidity = humidity;
        }

        @Override
        public String toString() {
            return time.getTime() +
                    String.format(" temperature: %.1f humidity: %.2f",
                            temperature, humidity);
        }
    }
//GreenHouse Class continues
    private Calendar lastTime = Calendar.getInstance();
    { // блок инициализации
        lastTime.set(Calendar.MINUTE, 30);
        lastTime.set(Calendar.SECOND, 00);
    }

    private float lastTemp = 65.0f;
    private int tempDirection = 1;
    private float lastHumidity = 50.0f;
    private int humidityDirection = 1;
    private Random rnd = new Random();
    List<DataPoint> data = Collections.synchronizedList(new ArrayList<>());

    class CollectData implements Runnable {  // генерирует случайные данные
        @Override
        public void run() {
            System.out.println("Collecting data");
            synchronized (GreenHouseScheduler.this) {       // блокирует родительский класс
                lastTime.set(Calendar.MINUTE, lastTime.get(Calendar.MINUTE)+30);
                if (rnd.nextInt(5) == 4) {
                    tempDirection = - tempDirection;        // сменить направление температуры 1 из 5
                }
                lastTemp = lastTemp + tempDirection*(1.0f+rnd.nextFloat()); // rnd 0..1
                if (rnd.nextInt(5) == 4) {
                    humidityDirection = - humidityDirection; // независимый случайный блок
                }
                lastHumidity = lastHumidity + humidityDirection*(1.0f+rnd.nextFloat()); // rnd 0..1
                //calendar клонируется для каждого объекта GreenHouse???
                data.add(new DataPoint((Calendar)lastTime.clone(),lastTemp,lastHumidity));
            }
        }
    }

    private class TaskRunner implements Runnable {
        @Override
        public void run() {
            try {
                while (!getCancel()) {
                    queue.take().run();  // выбрать задачу и выполнить
                }
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }


    public static void check() {
        GreenHouseScheduler gh = new GreenHouseScheduler();
        ExecutorService exec = Executors.newCachedThreadPool();

// заполнение событий
        gh.schedule(gh.new Terminate(),5000);                 // рестарт не требуется, работает планировщик
        gh.repeat(gh.new Bell(),0,1000);            // beep каждую 1 sec
        gh.repeat(gh.new ThermostatNight(),0,2000); // каждые 2 sec
        gh.repeat(gh.new LightOn(),0,200);          // каждые 0.2 sec
        gh.repeat(gh.new LightOff(),0,400);         // каждые 0.4 sec
        gh.repeat(gh.new WaterOn(),0,600);          // каждые 0.6 sec
        gh.repeat(gh.new WaterOff(),0,800);          // каждые 0.6 sec
        gh.repeat(gh.new ThermostatDay(),0,1400);    // каждые 1.4 sec
        gh.repeat(gh.new CollectData(),500,500);     // каждые 0.5 sec
        exec.execute(gh.new TaskRunner()); // отработка клиентов в отдельном потоке

        exec.shutdown();
    }


}
