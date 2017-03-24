package ch.ex26.access;

/**
 * Created by V1 on 17-Feb-17.
 */
public class GreenHouse extends Controller {    // Оранжерея
    private boolean light = false;              // свет отключен
    private boolean water = false;              // вода отключена
    private String thermo = "modeDay";          // термостат дневной режим
    private int airFlow = 0;                    // вентиляция
    private int bellCount = 0;                  // автозапуск Bell

    class LightOn extends Event {       // класс событие свет.включить
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

    class LightOff extends Event { // класс событие свет.выключить
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

    class WaterOn extends Event {       // класс событие свет.включить
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

    class WaterOff extends Event { // класс событие выключить
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

    class ThermoDay extends Event {         // класс событие включить
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

    class ThermoNight extends Event { // класс событие выключить
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

    class Bell extends Event {         // класс событие включить
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

    class Restart extends Event { // класс событие выключить
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

    class AirOn extends Event {         // класс событие включить
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

    class AirOff extends Event { // класс событие выключить
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

}
