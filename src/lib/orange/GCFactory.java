package lib.orange;

import java.util.List;

/**
 * Created by V1 on 08-Apr-17.
 */
abstract public class GCFactory implements IFactoryGC<GreenHouse, Event> {
    protected GreenHouse gc;
    protected long delay;
    protected int count;

    abstract public Event create();

    @Override
    public Event create(GreenHouse greenHouse, long delay) {
        return null;
    }

    @Override
    public Event create(GreenHouse greenHouse, long delay, int count, List<Event> list) {
        return null;
    }

    protected void initParam(GreenHouse gc, long delay) {
        if (gc == null || delay == 0) {
            throw new RuntimeException("Call not initialized object");
        }
        this.gc = gc;
        this.delay = delay;
        this.count = 1;  // заглушка
    }

    protected void checkParam() {
        if (gc == null || delay == 0 || count == 0) {
            throw new RuntimeException("Call not initialized object");
        }
    }

    public static class LightOn extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new LightOn(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new LightOn(delay);
        }
    }

    public static class LightOff extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new LightOff(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new LightOff(delay);
        }
    }

    public static class WaterOn extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new WaterOn(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new WaterOn(delay);
        }
    }

    public static class WaterOff extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new WaterOff(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new WaterOff(delay);
        }
    }

    public static class ThermoDay extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new ThermoDay(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new ThermoDay(delay);
        }
    }

    public static class ThermoNight extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new ThermoNight(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new ThermoNight(delay);
        }
    }

    public static class Bell extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new Bell(delay);
        }
// system variant
        @Override
        public Event create(GreenHouse gc, long delay, int count, List<Event> list) {
            initParam(gc, delay);
            return gc.new Bell(delay, count);
        }
    }

    public static class Restart extends GCFactory {
        private Event[] events;

        @Override
        public Event create() {
            checkParam();
            if (events == null) {
                throw new RuntimeException("Call not properly initialized Object");
            }
            return gc.new Restart(delay, events);
        }

        @Override
        public Event create(GreenHouse gc, long delay, int count, List<Event> list) {
            initParam(gc, delay);
            if (list == null) {
                throw new RuntimeException("Call not properly initialized Object");
            }

            events = list.toArray(new Event[0]);
            return gc.new Restart(delay, events);
        }

    }

    public static class TerminateGC extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return new Terminate(delay, gc);
        }

        @Override
        public Event create(GreenHouse gc, long delay, int count, List<Event> list) {
            initParam(gc, delay);
            return new Terminate(delay, gc);
        }
    }

    public static class AirOn extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new AirOn(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new AirOn(delay);
        }
    }

    public static class AirOff extends GCFactory {
        @Override
        public Event create() {
            checkParam();
            return gc.new AirOff(delay);
        }

        @Override
        public Event create(GreenHouse gc, long delay) {
            initParam(gc, delay);
            return gc.new AirOff(delay);
        }
    }

    public static class HumidityOn extends GCFactory {
            @Override
            public Event create () {
                checkParam();
                return ((HumidityControl)gc).new  HumidityOn(delay);
            }

            @Override
            public Event create (GreenHouse gc,long delay){
                initParam(gc, delay);
                return ((HumidityControl)gc).new  HumidityOn(delay);
            }
        }

        public static class HumidityOff extends GCFactory {
            @Override
            public Event create () {
                checkParam();
                return ((HumidityControl)gc).new  HumidityOff(delay);
            }

            @Override
            public Event create (GreenHouse gc,long delay){
                initParam(gc, delay);
                return ((HumidityControl)gc).new  HumidityOff(delay);
            }
    }

}
