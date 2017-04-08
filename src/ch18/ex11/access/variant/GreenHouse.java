package ch18.ex11.access.variant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by V1 on 17-Feb-17.
 */
public class GreenHouse extends Controller {    // Оранжерея
    private boolean light = false;              // свет отключен
    private boolean water = false;              // вода отключена
    private String thermo = "modeDay";          // термостат дневной режим
    private int airFlow = 0;                    // вентиляция
    private int bellCount = 0;                  // автозапуск Bell
    private List<IFactoryGC<? extends Event>> list = new ArrayList<>(); //
    private Map<String,IFactoryGC<? extends Event>> hMap = new HashMap<>();
    {
        hMap.put("AirOn", this.new FactoryAirOn());
        //hMap.put("AirOff", this.new FactoryAirOff());
        hMap.put("WaterOn", this.new FactoryWaterOn());
        hMap.put("WaterOff", this.new FactoryWaterOff());


    }

    public class LightOn extends Event {       // класс событие свет.включить
        public class Factory implements IFactoryGC<LightOn> {
            private long delay;
            public Factory() {
            }

            public Factory(long delay) {
                this.delay = delay;
            }

            @Override
            public LightOn create() {    // повторный перезапуск
                return new LightOn(delay);
            }
            @Override
            public IFactoryGC<LightOn> next(long delay) {  // первый запуск
                this.delay = delay;
                return new Factory(delay);
            }
          }


        public LightOn(long delayTime) {  // конструктор передает параметр вниз
            super(delayTime);
        }

        @Override
        public void action() {  // событие включить свет
            light = true;
        }

        @Override
        public String toString() {
            return "LightOn{}\n"; // состояние света включено
        }

    }

    public class LightOff extends Event { // класс событие свет.выключить
        public LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = false;
        }

        public String toString() {
            return "LightOff{}\n";
        }
    }

    public class WaterOn extends Event {       // класс событие свет.включить
        public WaterOn(long delayTime) {  // конструктор передает параметр вниз
            super(delayTime);
        }

        public void action() {  // событие включить
            water = true;
        }

        public String toString() {
            return "WaterOn{}\n"; // состояние включено
        }

    }

    public class WaterOff extends Event { // класс событие выключить
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = false;
        }

        public String toString() {
            return "WaterOff{}\n";
        }
    }

    public class ThermoDay extends Event {         // класс событие включить
        public ThermoDay(long delayTime) {  // конструктор передает параметр вниз
            super(delayTime);
        }

        @Override
        public void action() {  // событие mode Day
            thermo = "day";
        }

        @Override
        public String toString() {
            return "Thermostat {mode." + thermo + "}\n"; // состояние
        }
    }

    public class ThermoNight extends Event { // класс событие выключить
        public ThermoNight(long delayTime) {
            super(delayTime);
        }

        public void action() {  // событие mode Night
            thermo = "night";
        }

        public String toString() {
            return "Thermostat {mode." + thermo + "}\n"; // состояние
        }
    }

    public class Bell extends Event {         // класс событие включить
        public Bell(long delayTime, int bellCount) {  // конструктор передает параметр вниз
            super(delayTime);
            GreenHouse.this.bellCount = bellCount;
        }

        public Bell(long delayTime) {  // конструктор передает параметр вниз
            super(delayTime);
        }

        @Override
        public void action() {          // событие Bell сам себя добавляет и таким образом постоянно перезапускается
            if (--bellCount > 0) {       // добавляем фиксированное число раз
                addEvent(new Bell(delayTime)); // дополительно его добавлять не надо???
            }
        }

        @Override
        public String toString() {
            return "Bell\n"; // состояние
        }
    }

    public void add(IFactoryGC<? extends Event> event) {
        list.add(event);
    }

    public void remove(IFactoryGC<? extends Event> event) {  // удалить событие из списка
        list.remove(list.indexOf(event));
    }

    public void remove(int index) {  // удалить событие из списка
        list.remove(index);
    }

    public class Restart extends Event { // класс событие выключить

        public Restart(long delayTime) {  // события созданы снаружи
            super(delayTime);
        }

        public void action() {      // событие mode Night
            for (IFactoryGC<? extends Event> gen : list) {
                Event event = gen.create();
                event.start();      // запуск каждого события с нового момента времени
                addEvent(event);
            }
            start();                // запуск текущего события из экземпляра
            addEvent(this);       // добавление текущего события в список контроллера
        }

        public String toString() {
            return "Restart {done}\n"; // состояние
        }
    }


    public class AirOn extends Event {         // класс событие включить
        public AirOn(long delayTime) {  // конструктор передает параметр вниз
            super(delayTime);
        }

        @Override
        public void action() {  // событие mode Day
            airFlow = 100;
        }

        @Override
        public String toString() {
            return "AirOn {flow." + airFlow + ".lpm}\n"; // состояние
        }
    }

    public class AirOff extends Event { // класс событие выключить
        public AirOff(long delayTime) {
            super(delayTime);
        }

        public void action() {  // событие mode Night
            airFlow = 0;
        }

        public String toString() {
            return "AirOff {flow." + airFlow + ".lpm}\n"; // состояние
        }
    }

    public class FactoryAirOn implements IFactoryGC<AirOn>,IGeneratorGC<IFactoryGC<? extends Event>> {
        private long delay;
        public FactoryAirOn() {
        }

        public FactoryAirOn(long delay) {
            this.delay = delay;
        }

        @Override
        public AirOn create() {    // повторный перезапуск
            return new AirOn(delay);
        }
        @Override
        public IFactoryGC<AirOn> next(long delay) {  // первый запуск
            this.delay = delay;
            return new FactoryAirOn(delay);
        }

        @Override
        public IFactoryGC<AirOn> gen(long delay) {  // первый запуск
            this.delay = delay;
            return new FactoryAirOn(delay);
        }
    }

    public class FactoryAirOff {
        private long delay;

        public FactoryAirOff(long delay) {
            this.delay = delay;
        }

    }

    public class FactoryLightOn {

    }

    public class FactoryLightOff {

    }

    public class FactoryWaterOn implements IFactoryGC<WaterOn>, IGeneratorGC<IFactoryGC<? extends Event>> {
        private long delay;

        @Override
        public WaterOn create() {
            return new WaterOn(delay);
        }

        @Override
        public IFactoryGC<WaterOn> next(long delay) {  // реализация через интерфейс
            this.delay = delay;
            return new FactoryWaterOn();
        }

        @Override
        public IFactoryGC<WaterOn> gen(long delay) {
            this.delay = delay;
            return new FactoryWaterOn();
        }

    }

    public class FactoryWaterOff implements IFactoryGC<WaterOff>, IGeneratorGC<IFactoryGC<? extends Event>> {
        private long delay;

        @Override
        public WaterOff create() {
            return new WaterOff(delay);
        }

        @Override
        public IFactoryGC<WaterOff> next(long delay) {  // реализация через интерфейс
            this.delay = delay;
            return new FactoryWaterOff();
        }

        @Override
        public IFactoryGC<WaterOff> gen(long delay) {
            this.delay = delay;
            return new FactoryWaterOff();
        }
    }


}
