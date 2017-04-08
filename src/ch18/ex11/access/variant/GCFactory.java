package ch18.ex11.access.variant;

/**
 * Created by V1 on 08-Apr-17.
 */
public class GCFactory implements IFactoryGC2<GreenHouse, Event> {


    @Override
    public Event create(GreenHouse greenHouse, long delay) {
        return null;
    }

    @Override
    public Event create(GreenHouse greenHouse, long delay, long count) {
        return null;
    }

    public static class LightOn extends GCFactory {
        private long delay;
        private GreenHouse gc;
        public LightOn() {
        }

        public LightOn(GreenHouse gc, long delay) {
            this.delay = delay;
        }

//        @Override
//        public GreenHouse.LightOn create() {    // повторный перезапуск
//            return gc.new LightOn(delay);
//        }
//        @Override
//        public IFactoryGC<GreenHouse,GreenHouse.LightOn> next(GreenHouse gc, long delay) {  // первый запуск
//            this.delay = delay;
//            return new LightOn(gc,delay);
//        }

//        @Override
//        public GreenHouse.LightOn create(GreenHouse gc, long delay) {
//            return gc.new LightOn(delay);
//        }
//
//        @Override
//        public GreenHouse.LightOn create(GreenHouse greenHouse, long delay, long count) {
//            return null;
//        }
    }

}
