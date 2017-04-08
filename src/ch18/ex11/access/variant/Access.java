package ch18.ex11.access.variant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 Check\n");

        HumidityControl gc = new HumidityControl();          // создали объект оранжерея
        gc.addEvent(gc.new Bell(500, 7));   // 900ns создали объект внутреннего класса число повторов

        List<IFactoryGC<?extends Event>> list = new ArrayList<>();
        List<IFactoryGC<?extends Event>> listNext = new ArrayList<>();
        listNext.add(gc.new FactoryAirOn());
        listNext.add(gc.new FactoryWaterOn());
        List<IFactoryGC2<GreenHouse, ? extends Event>> listNext2 = new ArrayList<>();
        listNext2.add(new GCFactory.LightOn());  // объявили статическим


        List<IGeneratorGC<IFactoryGC<?extends Event>>> listGen = new ArrayList<>();
        listGen.add(gc.new FactoryAirOn());
        listGen.add(gc.new FactoryWaterOn()); // список генераторов

        listNext2.add(new GCFactory.LightOn());  // объявили статическим генератор LightOn

//      list.add(gc.new FactoryBell(500, 7));   // фабрика без запуска
        list.add(listGen.get(0).gen(750)); // фабрика и генератор
        list.add(listNext.get(1).next(900));    // фабрика и фабрика
        list.add(listNext.get(1).next(900));    // фабрика и фабрика



        Event e0 = list.get(0).create();
        Event e1 = list.get(1).create();
        Event e2 = list.get(2).create();

        Event e3 = listNext2.get(0).create(gc, 900, 500);


        gc.add(listGen.get(0).gen(750));
        gc.add(listNext.get(1).next(900));
        gc.add(listNext.get(0).next(2900));
        gc.add(listGen.get(0).gen(1750));
        Event[] events = new Event[]{e0, e1, e2
//                gc.new ThermoNight(250),  // переключить через 1 секунду
//                gc.new AirOn(500),
//                gc.new AirOff(750),
//                gc.new LightOn(1000),
//                gc.new LightOff(1500),
//                gc.new WaterOn(1750),
//                gc.new WaterOff(2000),
//                gc.new ThermoDay(2250),
//                gc.new HumidityOn(2500),
//                gc.new HumidityOff(2750)
        };
        gc.addEvent(gc.new Restart(3000));  // через 1 секунду добавить все события и Restart в конце
        gc.addEvent(new Terminate(6000, gc));  // через 2 цикла остановить

        gc.run(); // практически бесконечная железка
    }
}
