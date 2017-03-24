package ch11.ex12a.access;

import ch11.ex12a.orange.Event;
import ch11.ex12a.orange.GreenHouse;
import ch11.ex12a.orange.Terminate;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise   Check\n");

        GreenHouse gc = new GreenHouse();              // создали объект оранжерея
        gc.addEvent(gc.new Bell(250, 7));   // 900ns создали объект внутреннего класса число повторов

        Event[] events = new Event[]{
//                gc.new ThermoNight(25),  // переключить через 1 секунду
//                gc.new AirOn(50),
//                gc.new AirOff(75),
                gc.new LightOn(250),
                gc.new LightOff(500),
//                gc.new WaterOn(175),
//                gc.new WaterOff(200),
//                gc.new ThermoDay(225),
//                gc.new HumidityOn(250),
//                gc.new HumidityOff(275)
        };
        gc.addEvent(gc.new Restart(750,events));  // через 1 секунду добавить все события и Restart в конце
        gc.addEvent(new Terminate(1400, gc));  // через 2 цикла остановить
        gc.run(); // практически бесконечная железка

    }
}
