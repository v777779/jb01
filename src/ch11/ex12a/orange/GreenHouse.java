package ch11.ex12a.orange;

/**
 * Created by V1 on 17-Feb-17.
 */
public class GreenHouse extends Controller {    // Оранжерея
    private boolean light = false;              // свет отключен
    private boolean water = false;              // вода отключена
    private String thermo = "modeDay";          // термостат дневной режим
    private int airFlow = 0;                    // вентиляция
    private int bellCount = 0;                  // автозапуск Bell
    private boolean humidity = false;           // включение, выключение


    public class LightOn extends Event {       // класс событие свет.включить
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

    public class Restart extends Event { // класс событие выключить
        private Event[] events;

        public Restart(long delayTime, Event[] events) {  // события созданы снаружи
            super(delayTime);
            this.events = events;   // список внешний событий берем снаружи
        }

        public void action() {      // событие mode Night
            for (Event event : events) {
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

    public class HumidityOn extends Event {       // класс событие свет.включить
        public HumidityOn(long delayTime) {  // конструктор передает параметр вниз
            super(delayTime);
        }

        @Override
        public void action() {  // событие включить свет
            humidity = true;
        }

        @Override
        public String toString() {
            return "HumidityOn{}\n"; // состояние света включено
        }
    }

    public class HumidityOff extends Event { // класс событие свет.выключить
        public HumidityOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            humidity = false;
        }

        public String toString() {
            return "HumidityOff{}\n";
        }
    }


}
