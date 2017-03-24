package ch.ex25.access;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Access {
    public static void app() {
        GreenHouse gc = new GreenHouse(); // создали объект оранжерея
        gc.addEvent(gc.new Bell(50, 7));  // 900ns создали объект внутреннего класса число автоповторов

        Event[] events = new Event[]{
                gc.new ThermoNight(25),  // переключить через 1 секунду
                gc.new AirOn(50),
                gc.new AirOff(75),
                gc.new LightOn(150),
                gc.new LightOff(175),
                gc.new WaterOn(200),
                gc.new WaterOff(225),
                gc.new ThermoDay(250)
        };
        gc.addEvent(gc.new Restart(300,events));  // через 1 секунду добавить все события и Restart в конце
        gc.addEvent(new Terminate(500, gc));  // через 2 цикла остановить
        gc.run(); // практически бесконечная железка


    }
}
