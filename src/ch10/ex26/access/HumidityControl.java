package ch10.ex26.access;

/**
 * Created by V1 on 17-Feb-17.
 */
public class HumidityControl extends GreenHouse {
    private boolean humidity = false;  // включение, выключение

    class HumidityOn extends Event {       // класс событие свет.включить
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

    class HumidityOff extends Event { // класс событие свет.выключить
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
