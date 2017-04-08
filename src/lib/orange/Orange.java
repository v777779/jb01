package lib.orange;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Orange {
    public static void app() {
        System.out.println("\n====Orange===");

        HumidityControl gc = new HumidityControl();          // создали объект оранжерея

//        String fileName = "./src/ch18/ex11/access/EventsList.java";
//        GCFileRead.events(gc, fileName);  // прочитали и упаковали
//        gc.run(); // запустили


        gc.addEvent(new Terminate(6000, gc));  // через 2 цикла остановить
        gc.addEvent(gc.new Bell(500, 7));   // 900ns создали объект внутреннего класса число повторов

        Event[] events = new Event[]{
                gc.new ThermoNight(250),  // переключить через 1 секунду
                gc.new AirOn(500),
                gc.new AirOff(750),
                gc.new LightOn(1000),
                gc.new LightOff(1500),
                gc.new WaterOn(1750),
                gc.new WaterOff(2000),
                gc.new ThermoDay(2250),
                gc.new HumidityOn(2500),
                gc.new HumidityOff(2750)
        };
        gc.addEvent(gc.new Restart(3000,events));  // через 1 секунду добавить все события и Restart в конце
        gc.run(); // практически бесконечная железка
    }
}
