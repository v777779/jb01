package ch.ex26.access;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Access {
    public static void app() {

        HumidityControl gc = new HumidityControl();              // создали объект оранжерея
        gc.addEvent(gc.new Bell(50, 7));   // 900ns создали объект внутреннего класса число повторов

        Event[] events = new Event[]{
                gc.new ThermoNight(25),  // переключить через 1 секунду
                gc.new AirOn(50),
                gc.new AirOff(75),
                gc.new LightOn(100),
                gc.new LightOff(150),
                gc.new WaterOn(175),
                gc.new WaterOff(200),
                gc.new ThermoDay(225),
                gc.new HumidityOn(250),
                gc.new HumidityOff(275)
        };
        gc.addEvent(gc.new Restart(300,events));  // через 1 секунду добавить все события и Restart в конце
        gc.addEvent(new Terminate(600, gc));  // через 2 цикла остановить
        gc.run(); // практически бесконечная железка


    }
}
